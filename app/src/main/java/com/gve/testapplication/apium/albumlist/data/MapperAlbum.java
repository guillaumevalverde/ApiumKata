package com.gve.testapplication.apium.albumlist.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by gve on 07/11/2017.
 */

public class MapperAlbum {

    public static Function<DataRaw, Album> mapperArticleRawToArticle =
            dataRaw -> {
                if (!DataRaw.isAlbum(dataRaw)) {
                    throw new IllegalArgumentException();
                }

             return Album.createAlbum(dataRaw.collectionId(),
                     dataRaw.collectionName() == null ? "" : dataRaw.collectionName(),
                     dataRaw.artistName() == null ? "" : dataRaw.artistName(),
                     dataRaw.artworkUrl100() == null ? "" : dataRaw.artworkUrl100(),
                     dataRaw.trackCount() == null ? 0 : dataRaw.trackCount());
            };

    public static Function<List<DataRaw>, Observable<List<Album>>> mapperRawToAlbumList =
            dataRaw -> Observable.fromIterable(dataRaw)
                        .filter(dataRaw1 -> DataRaw.isAlbum(dataRaw1))
                        .map(mapperArticleRawToArticle)
                        .toList()
                    .toObservable();



}
