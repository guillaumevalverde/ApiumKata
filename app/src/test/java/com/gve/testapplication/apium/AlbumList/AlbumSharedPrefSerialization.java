package com.gve.testapplication.apium.AlbumList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gve.testapplication.core.app.DataAdapterFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gve on 15/11/2017.
 */

public class AlbumSharedPrefSerialization {

    private static final String SHARED_PREF_JSON = "{\"time\":1510789752914,\"data\":[{\"artistName\":\"Jack Johnson\",\"name\":\"In Between Dreams\",\"thumbnail\":\"http://is1.mzstatic.com/image/thumb/Music2/v4/a2/66/32/a2663205-663c-8301-eec7-57937c2d0878/source/100x100bb.jpg\",\"id\":879273552,\"trackCount\":16},{\"artistName\":\"Jack Johnson\",\"name\":\"To the Sea\",\"thumbnail\":\"http://is5.mzstatic.com/image/thumb/Music4/v4/c3/1f/19/c31f1915-7662-ac71-598c-c5ad8a6ab5a8/source/100x100bb.jpg\",\"id\":879206883,\"trackCount\":15},{\"artistName\":\"Jack Johnson\",\"name\":\"From Here to Now to You\",\"thumbnail\":\"http://is1.mzstatic.com/image/thumb/Music/v4/5e/54/6b/5e546bc2-8db4-c062-b2ae-b8e123092a7c/source/100x100bb.jpg\",\"id\":659234734,\"trackCount\":12},{\"artistName\":\"Jack Johnson\",\"name\":\"Sleep Through the Static\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7d/26/43/7d2643d8-e66f-7bb0-0e76-26b36531753f/source/100x100bb.jpg\",\"id\":879716730,\"trackCount\":15},{\"artistName\":\"Jack Johnson\",\"name\":\"Jack Johnson \\u0026 Friends - Best of Kokua Festival (A Benefit for the Kokua Hawaii Foundation)\",\"thumbnail\":\"http://is1.mzstatic.com/image/thumb/Music/v4/a4/cc/3a/a4cc3aa2-49e1-bc3b-e1fe-d3d770ae4da5/source/100x100bb.jpg\",\"id\":513801594,\"trackCount\":14},{\"artistName\":\"Jack Johnson\",\"name\":\"En Concert (Bonus Track Version) [Live]\",\"thumbnail\":\"http://is5.mzstatic.com/image/thumb/Music/v4/2c/7b/d9/2c7bd9cd-f13c-8d08-71af-878bc310dc47/source/100x100bb.jpg\",\"id\":333365555,\"trackCount\":21},{\"artistName\":\"Jack Johnson\",\"name\":\"Brushfire Fairytales (Remastered) [Bonus Version]\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music5/v4/e9/6f/ef/e96fefcd-fac9-ebb5-59ce-f0229c59b190/source/100x100bb.jpg\",\"id\":906900960,\"trackCount\":15},{\"artistName\":\"Jack Johnson\",\"name\":\"All the Light Above It Too\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music117/v4/a2/27/0a/a2270ad2-a2e8-b3fa-ac24-08432603bf7d/source/100x100bb.jpg\",\"id\":1256653006,\"trackCount\":10},{\"artistName\":\"Jack Johnson\",\"name\":\"Jack Johnson and Friends: Sing-A-Longs and Lullabies For the Film Curious George\",\"thumbnail\":\"http://is5.mzstatic.com/image/thumb/Music/v4/19/32/e5/1932e5d6-0ec5-0237-6be9-f6fffd80e85c/source/100x100bb.jpg\",\"id\":879269460,\"trackCount\":16},{\"artistName\":\"Jack Johnson\",\"name\":\"Sessions@AOL - EP\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/0f/3a/ac/0f3aac80-1f87-7e61-607a-48865ec69fb7/source/100x100bb.jpg\",\"id\":76531919,\"trackCount\":4},{\"artistName\":\"Jack Johnson\",\"name\":\"On and On\",\"thumbnail\":\"http://is5.mzstatic.com/image/thumb/Music6/v4/9d/e5/1d/9de51deb-0354-4ca0-e8cd-3fb83e0cfc73/source/100x100bb.jpg\",\"id\":879210148,\"trackCount\":17},{\"artistName\":\"Jack Johnson\",\"name\":\"Sleep Through the Static: Remixed\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7f/ea/94/7fea9433-47fc-e53b-0cac-3dc60bf80245/source/100x100bb.jpg\",\"id\":292171691,\"trackCount\":10},{\"artistName\":\"Jack Johnson\",\"name\":\"From Here To Now To You Live - EP\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/fa/b3/a0/fab3a016-ba92-76ca-7bf7-a75e29edc685/source/100x100bb.jpg\",\"id\":866119737,\"trackCount\":6},{\"artistName\":\"Jack Johnson\",\"name\":\"En Concert\",\"thumbnail\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/24/3b/e6/243be66d-ba76-0ebe-6688-7076e175e3ab/source/100x100bb.jpg\",\"id\":879248811,\"trackCount\":20},{\"artistName\":\"Jack Johnson\",\"name\":\"iTunes Festival: London 2013 - EP\",\"thumbnail\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/06/73/85/06738534-7372-7fc8-3d95-431939d60164/source/100x100bb.jpg\",\"id\":799666181,\"trackCount\":8},{\"artistName\":\"Jack Johnson and Friends\",\"name\":\"A Weekend At the Greek (Live)\",\"thumbnail\":\"http://is4.mzstatic.com/image/thumb/Music/v4/6c/54/74/6c547428-cf1c-e143-a6d5-a5e815c0c5f7/source/100x100bb.jpg\",\"id\":109181599,\"trackCount\":22},{\"artistName\":\"Jack Johnson\",\"name\":\"Live At the Kokua Festival - Single\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/99/09/3f/99093f88-4365-1548-34e2-017f77b89ac3/source/100x100bb.jpg\",\"id\":66275797,\"trackCount\":2},{\"artistName\":\"Zach Gill \\u0026 Jack Johnson\",\"name\":\"Family - Single\",\"thumbnail\":\"http://is1.mzstatic.com/image/thumb/Music/v4/83/69/6a/83696a73-d8f0-1d97-e119-bb15b8c33d86/source/100x100bb.jpg\",\"id\":278985055,\"trackCount\":2},{\"artistName\":\"Jack Johnson\",\"name\":\"In the Morning - Single\",\"thumbnail\":\"http://is3.mzstatic.com/image/thumb/Music/v4/07/b5/fb/07b5fbfd-db9e-ea83-ddca-365d6faac48c/source/100x100bb.jpg\",\"id\":474585064,\"trackCount\":1},{\"artistName\":\"Ted Lennon\",\"name\":\"So in Love (Acoustic Remix) [feat. Jack Johnson \\u0026 Colbie Caillat] - Single\",\"thumbnail\":\"http://is2.mzstatic.com/image/thumb/Music/v4/ff/d6/10/ffd610d2-b3b4-8427-3e25-c79e3022aa44/source/100x100bb.jpg\",\"id\":525958892,\"trackCount\":1},{\"artistName\":\"Manuel Garcia, Silvia Tómas, Jack Johnson \\u0026 Paula Fuga\",\"name\":\"Farewell (From \\\"El Mar, Mi Alma\\\") - Single\",\"thumbnail\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/59/71/8b/59718b6a-0162-90e7-e968-7a6004c65535/source/100x100bb.jpg\",\"id\":663930937,\"trackCount\":1},{\"artistName\":\"Jack Johnson \\u0026 The Roots\",\"name\":\"Rudolph the Red Nosed Reindeer (Live from Late Night with Jimmy Fallon) - Single\",\"thumbnail\":\"http://is1.mzstatic.com/image/thumb/Music6/v4/b8/60/7f/b8607fd0-cb77-27fb-1798-405dfd45cdea/source/100x100bb.jpg\",\"id\":772111884,\"trackCount\":1},{\"artistName\":\"Jack Johnson\",\"name\":\"Seasick Dream - Single\",\"thumbnail\":\"http://is5.mzstatic.com/image/thumb/Music7/v4/14/21/99/142199f6-5c9f-ff24-f03d-3cb43b221ac4/source/100x100bb.jpg\",\"id\":1062115538,\"trackCount\":1}]}";

    private Gson gson;

    @Before
    public void setUp() {
        final GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapterFactory(DataAdapterFactory.create());
        gson = builder.create();
    }

    @Test
    public void serializedSharedPredJsonTest() {
        JsonPojoAlbum jsonPojoAlbum = SharedPreferenceAlbumStore.getListFromJson(SHARED_PREF_JSON, gson);

        assertEquals(23, jsonPojoAlbum.data().size());
    }
}
