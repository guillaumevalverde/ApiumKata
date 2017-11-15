package com.gve.testapplication.apium.AlbumList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gve.testapplication.apium.albumlist.data.Album;
import com.gve.testapplication.apium.albumlist.data.ConstItunes;
import com.gve.testapplication.apium.albumlist.data.DataListRaw;
import com.gve.testapplication.apium.albumlist.data.DataRaw;
import com.gve.testapplication.apium.albumlist.data.MapperAlbum;
import com.gve.testapplication.core.app.DataAdapterFactory;
import com.gve.testapplication.test_common.BaseTest;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.observers.TestObserver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by gve on 15/11/2017.
 */

public class AlbumDataTest extends BaseTest {

    private Gson gson;

    @Before
    public void setUp() {
        final GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(DataAdapterFactory.create());
        gson = builder.create();
    }

    @Test
    public void deserializeWrapperTypeArtist() {
        DataRaw dataRaw = gson.fromJson(AlbumDataTestUtils.ARTIST_JSON, DataRaw.class);

        assertEquals(ConstItunes.WRAPPER_ARTIST_TYPE, dataRaw.wrapperType());
    }

    @Test
    public void deserializeWrapperTypeAlbum() {
        DataRaw dataRaw = gson.fromJson(AlbumDataTestUtils.COLLECTION_TYPE_ALBUM_JSON, DataRaw.class);

        assertEquals(ConstItunes.WRAPPER_COLLECTION_TYPE, dataRaw.wrapperType());
        assertEquals(ConstItunes.COLLECTION_ALBUM_TYPE, dataRaw.collectionType());
    }

    @Test
    public void deserializeRawDataFromGet() {
        DataListRaw dataListRaw = gson.fromJson(AlbumDataTestUtils.RAW_JSON_GET_LIST, DataListRaw.class);

        assertEquals(AlbumDataTestUtils.RESULT_COUNT, dataListRaw.getDataRawList().size());
    }

    @Test
    public void dataRawIsAlbum() {
        DataRaw dataRaw = gson.fromJson(AlbumDataTestUtils.COLLECTION_TYPE_ALBUM_JSON, DataRaw.class);
        assertTrue(DataRaw.isAlbum(dataRaw));
    }

    @Test
    public void dataRawIsNotAlbum() {
        DataRaw dataRaw = gson.fromJson(AlbumDataTestUtils.ARTIST_JSON, DataRaw.class);
        assertFalse(DataRaw.isAlbum(dataRaw));
    }

    @Test
    public void getListAlbumFromListRaw() {
        DataListRaw dataListRaw = gson.fromJson(AlbumDataTestUtils.RAW_JSON_GET_LIST, DataListRaw.class);

        TestObserver<List<Album>> testObserver =
                Single.just(dataListRaw.getDataRawList())
                        .flatMap(list -> MapperAlbum.mapperRawToAlbumList.apply(list))
                        .test();

        testObserver.assertValueAt(0, albums -> albums.size() == AlbumDataTestUtils.RESULT_COUNT_ALBUM);
    }


}
