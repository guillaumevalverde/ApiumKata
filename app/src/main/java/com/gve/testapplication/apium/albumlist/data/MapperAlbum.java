package com.gve.testapplication.apium.albumlist.data;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * Created by gve on 07/11/2017.
 */

public class MapperAlbum {

    public static Function<DataRaw, Album> mapperArticleRawToArticle =
            dataRaw -> {
                if (!DataRaw.Companion.isAlbum(dataRaw)) {
                    throw new IllegalArgumentException();
                }

             return new Album(dataRaw.getCollectionId(),
                     dataRaw.getCollectionName() == null ? "" : dataRaw.getCollectionName(),
                     dataRaw.getArtistName() == null ? "" : dataRaw.getArtistName(),
                     dataRaw.getArtworkUrl100() == null ? "" : dataRaw.getArtworkUrl100(),
                     dataRaw.getTrackCount() == null ? 0 : dataRaw.getTrackCount());
            };

    public static Function<List<DataRaw>, Single<List<Album>>> mapperRawToAlbumList =
            dataRaw -> Observable.fromIterable(dataRaw)
                        .filter(dataRaw1 -> DataRaw.Companion.isAlbum(dataRaw1))
                        .map(mapperArticleRawToArticle)
                        .toList();

}
