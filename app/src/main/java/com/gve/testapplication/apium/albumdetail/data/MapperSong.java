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
                if (!DataRaw.isSong(dataRaw)) {
                    throw new IllegalArgumentException();
                }

             return Song.createSong(dataRaw.trackId(),
                     dataRaw.trackName() == null ? "" : dataRaw.trackName(),
                     dataRaw.artistName() == null ? "" : dataRaw.artistName(),
                     dataRaw.trackTimeMillis() == null ? 0l : dataRaw.trackTimeMillis(),
                     dataRaw.collectionId());
            };

    public static Function<List<DataRaw>, Single<List<Song>>> mapperRawToSongList =
            dataRaw -> Observable.fromIterable(dataRaw)
                        .filter(dataRaw1 -> DataRaw.isSong(dataRaw1))
                        .map(mapperArticleRawToSong)
                        .toList();

}
