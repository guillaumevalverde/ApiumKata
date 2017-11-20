package com.gve.testapplication.apium.albumdetail.data;

import com.gve.testapplication.apium.albumlist.data.DataRaw;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;

/**
 * Created by gve on 07/11/2017.
 */

public class MapperSong {

    public static Function<DataRaw, Song> mapperArticleRawToSong =
            dataRaw -> {
                if (!DataRaw.Companion.isSong(dataRaw)) {
                    throw new IllegalArgumentException();
                }

             return new Song(dataRaw.getTrackId(),
                     dataRaw.getTrackName() == null ? "" : dataRaw.getTrackName(),
                     dataRaw.getArtistName() == null ? "" : dataRaw.getArtistName(),
                     dataRaw.getTrackTimeMillis() == null ? 0l : dataRaw.getTrackTimeMillis(),
                     dataRaw.getCollectionId());
            };

    public static Function<List<DataRaw>, Single<List<Song>>> mapperRawToSongList =
            dataRaw -> Observable.fromIterable(dataRaw)
                        .filter(dataRaw1 -> DataRaw.Companion.isSong(dataRaw1))
                        .map(mapperArticleRawToSong)
                        .toList();

}
