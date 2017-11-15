package com.gve.testapplication.apium.albumlist.data;

import android.support.annotation.NonNull;

import com.gve.testapplication.articlelist.data.ArticleRaw;
import com.gve.testapplication.core.data.ReactiveStore;
import com.gve.testapplication.core.data.RepoList;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by gve on 01/11/2017.
 */

public class AlbumRepo implements RepoList<Album> {

    private ItunesNetworkService fetcher;
    private ReactiveStore<Album> sharedPreferenceStore;
    private static final long TIME_AMOUNT_VALIDATE = 1 * 60 * 60 * 1000;
    private CompositeDisposable disposable = new CompositeDisposable();

    @Inject
    public AlbumRepo(@NonNull ItunesNetworkService fetcher,
                     @NonNull ReactiveStore<Album> sharedPreferenceStore) {
        this.fetcher = fetcher;
        this.sharedPreferenceStore = sharedPreferenceStore;
    }

    @Override
    public Completable fetch() {
        return fetcher.fetchRawListData()
                .flatMap(MapperAlbum.mapperRawToAlbumList)
                // put mapped objects in store
                .doOnSuccess(sharedPreferenceStore::storeAll)
                .toCompletable();
    }

    @Override
    public Flowable<List<Album>> getStream() {
        return sharedPreferenceStore.<ArticleRaw, Long>getAll()
                .doOnNext(pair -> {
                    if (isDataDeprecated(pair.second)) {
                        disposable.add(fetch().subscribe(() -> System.out.println("fetch ListArticle"),
                                        error -> System.out.println("error fetch ListArticle"
                                                + error.getMessage())));
                    }
                })
                .map(p -> p.first);
    }

    public static boolean isDataDeprecated(long time) {
        return ((new Date()).getTime() - time) > TIME_AMOUNT_VALIDATE;
    }
}
