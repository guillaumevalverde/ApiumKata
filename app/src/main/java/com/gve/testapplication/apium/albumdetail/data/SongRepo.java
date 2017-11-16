package com.gve.testapplication.apium.albumdetail.data;

import android.support.annotation.NonNull;

import com.gve.testapplication.apium.albumlist.data.Album;
import com.gve.testapplication.apium.albumlist.data.ItunesNetworkService;
import com.gve.testapplication.core.data.ReactiveStore;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Function;

/**
 * Created by gve on 01/11/2017.
 */

public class SongRepo {

    private ItunesNetworkService fetcher;
    private ReactiveStore<List<Song>> reactiveStore;
    private static final long TIME_AMOUNT_VALIDATE = 1 * 60 * 60 * 1000;
    private CompositeDisposable disposable = new CompositeDisposable();

    @Inject
    public SongRepo(@NonNull ItunesNetworkService fetcher,
                    @NonNull ReactiveStore<List<Song>> reactiveStore) {
        this.fetcher = fetcher;
        this.reactiveStore = reactiveStore;
    }

    public Completable fetch(long id) {
        return fetcher.fetchSongRawListData(id)
                .flatMap(MapperSong.mapperRawToSongList)
                // put mapped objects in store
                .doOnSuccess(reactiveStore::storeSingular)
                .toCompletable();
    }

    public Flowable<List<Song>> getStream(long key) {
            return reactiveStore.<Long, List<Album>>getSingular(getKeyFromAlbum(key))
                    .doOnNext(pair -> {
                        if (isDataDeprecated(pair.first)) {
                            disposable.add(fetch(key)
                                    .subscribe(() -> System.out.println("fetch ListArticle"),
                                            error -> System.out.println("error fetch ListArticle"
                                                    + error.getMessage())));
                        }
                    })
                    .map(p -> p.second);

    }

    public static boolean isDataDeprecated(long time) {
        return ((new Date()).getTime() - time) > TIME_AMOUNT_VALIDATE;
    }

    public static Function<List<Song>, String> getKeyFunction() {
        return songs -> getKeyFromAlbum(songs.get(0).albumId());
    }

    public static String getKeyFromAlbum(long albumId) {
        return "SongAlbum: " + albumId;
    }

}