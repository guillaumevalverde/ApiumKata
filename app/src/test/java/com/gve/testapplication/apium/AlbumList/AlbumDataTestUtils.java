package com.gve.testapplication.apium.AlbumList;

import com.gve.testapplication.apium.albumlist.data.Album;

/**
 * Created by gve on 15/11/2017.
 */

public class AlbumDataTestUtils {

    public static final String COLLECTION_TYPE_ALBUM_JSON = "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879206883, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"To the Sea\", \"collectionCensoredName\":\"To the Sea\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/to-the-sea/879206883?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music4/v4/c3/1f/19/c31f1915-7662-ac71-598c-c5ad8a6ab5a8/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music4/v4/c3/1f/19/c31f1915-7662-ac71-598c-c5ad8a6ab5a8/source/100x100bb.jpg\", \"collectionPrice\":9.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":15, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2010-06-01T07:00:00Z\", \"primaryGenreName\":\"Rock\"}";

    public static final String ARTIST_JSON = "{\"wrapperType\":\"artist\", \"artistType\":\"Artist\", \"artistName\":\"Jack Johnson\", \"artistLinkUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"artistId\":909253, \"amgArtistId\":468749, \"primaryGenreName\":\"Rock\", \"primaryGenreId\":21}";

    public static final String RAW_JSON_GET_LIST = "\n" +
            "\n" +
            "\n" +
            "{\n" +
            " \"resultCount\":24,\n" +
            " \"results\": [\n" +
            "{\"wrapperType\":\"artist\", \"artistType\":\"Artist\", \"artistName\":\"Jack Johnson\", \"artistLinkUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"artistId\":909253, \"amgArtistId\":468749, \"primaryGenreName\":\"Rock\", \"primaryGenreId\":21}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879273552, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"In Between Dreams\", \"collectionCensoredName\":\"In Between Dreams\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/in-between-dreams/879273552?uo=4\", \"artworkUrl60\":\"http://is1.mzstatic.com/image/thumb/Music2/v4/a2/66/32/a2663205-663c-8301-eec7-57937c2d0878/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is1.mzstatic.com/image/thumb/Music2/v4/a2/66/32/a2663205-663c-8301-eec7-57937c2d0878/source/100x100bb.jpg\", \"collectionPrice\":7.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":16, \"copyright\":\"℗ 2013 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2005-03-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879206883, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"To the Sea\", \"collectionCensoredName\":\"To the Sea\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/to-the-sea/879206883?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music4/v4/c3/1f/19/c31f1915-7662-ac71-598c-c5ad8a6ab5a8/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music4/v4/c3/1f/19/c31f1915-7662-ac71-598c-c5ad8a6ab5a8/source/100x100bb.jpg\", \"collectionPrice\":9.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":15, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2010-06-01T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":659234734, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"From Here to Now to You\", \"collectionCensoredName\":\"From Here to Now to You\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/from-here-to-now-to-you/659234734?uo=4\", \"artworkUrl60\":\"http://is1.mzstatic.com/image/thumb/Music/v4/5e/54/6b/5e546bc2-8db4-c062-b2ae-b8e123092a7c/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is1.mzstatic.com/image/thumb/Music/v4/5e/54/6b/5e546bc2-8db4-c062-b2ae-b8e123092a7c/source/100x100bb.jpg\", \"collectionPrice\":6.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":12, \"copyright\":\"℗ 2013 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2013-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879716730, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Sleep Through the Static\", \"collectionCensoredName\":\"Sleep Through the Static\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/sleep-through-the-static/879716730?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7d/26/43/7d2643d8-e66f-7bb0-0e76-26b36531753f/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7d/26/43/7d2643d8-e66f-7bb0-0e76-26b36531753f/source/100x100bb.jpg\", \"collectionPrice\":7.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":15, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2008-02-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":513801594, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Jack Johnson & Friends - Best of Kokua Festival (A Benefit for the Kokua Hawaii Foundation)\", \"collectionCensoredName\":\"Jack Johnson & Friends - Best of Kokua Festival (A Benefit for the Kokua Hawaii Foundation)\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/jack-johnson-friends-best-kokua-festival-benefit-for/513801594?uo=4\", \"artworkUrl60\":\"http://is1.mzstatic.com/image/thumb/Music/v4/a4/cc/3a/a4cc3aa2-49e1-bc3b-e1fe-d3d770ae4da5/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is1.mzstatic.com/image/thumb/Music/v4/a4/cc/3a/a4cc3aa2-49e1-bc3b-e1fe-d3d770ae4da5/source/100x100bb.jpg\", \"collectionPrice\":11.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":14, \"copyright\":\"℗ 2012 Brushfire Records Inc\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2012-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":333365555, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"En Concert (Bonus Track Version) [Live]\", \"collectionCensoredName\":\"En Concert (Bonus Track Version) [Live]\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/en-concert-bonus-track-version-live/333365555?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music/v4/2c/7b/d9/2c7bd9cd-f13c-8d08-71af-878bc310dc47/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music/v4/2c/7b/d9/2c7bd9cd-f13c-8d08-71af-878bc310dc47/source/100x100bb.jpg\", \"collectionPrice\":10.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":21, \"copyright\":\"℗ 2009 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2009-10-26T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":1256653006, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"All the Light Above It Too\", \"collectionCensoredName\":\"All the Light Above It Too\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/all-the-light-above-it-too/1256653006?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music117/v4/a2/27/0a/a2270ad2-a2e8-b3fa-ac24-08432603bf7d/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music117/v4/a2/27/0a/a2270ad2-a2e8-b3fa-ac24-08432603bf7d/source/100x100bb.jpg\", \"collectionPrice\":10.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":10, \"copyright\":\"℗ 2017 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2017-09-08T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":906900960, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Brushfire Fairytales (Remastered) [Bonus Version]\", \"collectionCensoredName\":\"Brushfire Fairytales (Remastered) [Bonus Version]\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/brushfire-fairytales-remastered-bonus-version/906900960?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music5/v4/e9/6f/ef/e96fefcd-fac9-ebb5-59ce-f0229c59b190/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music5/v4/e9/6f/ef/e96fefcd-fac9-ebb5-59ce-f0229c59b190/source/100x100bb.jpg\", \"collectionPrice\":9.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":15, \"copyright\":\"℗ 2011 Everloving Records\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2011-04-12T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879269460, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Jack Johnson and Friends: Sing-A-Longs and Lullabies For the Film Curious George\", \"collectionCensoredName\":\"Jack Johnson and Friends: Sing-A-Longs and Lullabies For the Film Curious George\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/jack-johnson-friends-sing-longs-lullabies-for-film/879269460?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music/v4/19/32/e5/1932e5d6-0ec5-0237-6be9-f6fffd80e85c/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music/v4/19/32/e5/1932e5d6-0ec5-0237-6be9-f6fffd80e85c/source/100x100bb.jpg\", \"collectionPrice\":7.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":16, \"copyright\":\"℗ 2014 Brushfire Records\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2006-02-07T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":76531919, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Sessions@AOL - EP\", \"collectionCensoredName\":\"Sessions@AOL - EP\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/sessions-aol-ep/76531919?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/0f/3a/ac/0f3aac80-1f87-7e61-607a-48865ec69fb7/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/0f/3a/ac/0f3aac80-1f87-7e61-607a-48865ec69fb7/source/100x100bb.jpg\", \"collectionPrice\":3.96, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":4, \"copyright\":\"℗ 2005 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2005-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879210148, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"On and On\", \"collectionCensoredName\":\"On and On\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/on-and-on/879210148?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music6/v4/9d/e5/1d/9de51deb-0354-4ca0-e8cd-3fb83e0cfc73/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music6/v4/9d/e5/1d/9de51deb-0354-4ca0-e8cd-3fb83e0cfc73/source/100x100bb.jpg\", \"collectionPrice\":6.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":17, \"copyright\":\"℗ 2014 The Moonshine Conspiracy Records Manufactured and Marketed by Universal Records, a Division of UMG Recordings, Inc.\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2003-05-06T07:00:00Z\", \"primaryGenreName\":\"Pop\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":292171691, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Sleep Through the Static: Remixed\", \"collectionCensoredName\":\"Sleep Through the Static: Remixed\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/sleep-through-the-static-remixed/292171691?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7f/ea/94/7fea9433-47fc-e53b-0cac-3dc60bf80245/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/7f/ea/94/7fea9433-47fc-e53b-0cac-3dc60bf80245/source/100x100bb.jpg\", \"collectionPrice\":6.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":10, \"copyright\":\"℗ 2008 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2008-01-01T08:00:00Z\", \"primaryGenreName\":\"Alternative\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":866119737, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"From Here To Now To You Live - EP\", \"collectionCensoredName\":\"From Here To Now To You Live - EP\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/from-here-to-now-to-you-live-ep/866119737?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/fa/b3/a0/fab3a016-ba92-76ca-7bf7-a75e29edc685/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/fa/b3/a0/fab3a016-ba92-76ca-7bf7-a75e29edc685/source/100x100bb.jpg\", \"collectionPrice\":4.49, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":6, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2014-04-22T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":879248811, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"En Concert\", \"collectionCensoredName\":\"En Concert\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/en-concert/879248811?uo=4\", \"artworkUrl60\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/24/3b/e6/243be66d-ba76-0ebe-6688-7076e175e3ab/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/24/3b/e6/243be66d-ba76-0ebe-6688-7076e175e3ab/source/100x100bb.jpg\", \"collectionPrice\":9.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":20, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2009-10-26T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":799666181, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"iTunes Festival: London 2013 - EP\", \"collectionCensoredName\":\"iTunes Festival: London 2013 - EP\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/itunes-festival-london-2013-ep/799666181?uo=4\", \"artworkUrl60\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/06/73/85/06738534-7372-7fc8-3d95-431939d60164/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/06/73/85/06738534-7372-7fc8-3d95-431939d60164/source/100x100bb.jpg\", \"collectionPrice\":6.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":8, \"copyright\":\"℗ 2014 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2014-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":109181599, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson and Friends\", \"collectionName\":\"A Weekend At the Greek (Live)\", \"collectionCensoredName\":\"A Weekend At the Greek (Live)\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/a-weekend-at-the-greek-live/109181599?uo=4\", \"artworkUrl60\":\"http://is4.mzstatic.com/image/thumb/Music/v4/6c/54/74/6c547428-cf1c-e143-a6d5-a5e815c0c5f7/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is4.mzstatic.com/image/thumb/Music/v4/6c/54/74/6c547428-cf1c-e143-a6d5-a5e815c0c5f7/source/100x100bb.jpg\", \"collectionPrice\":-1.00, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":22, \"copyright\":\"℗ 2005 Brushfire Records Inc UNDER EXCLUSIVE LICENSE TO UNIVERSAL INTERNATIONAL MUSIC B.V., A UNIVERSAL MUSIC GROUP COMPANY\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2005-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":66275797, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Live At the Kokua Festival - Single\", \"collectionCensoredName\":\"Live At the Kokua Festival - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/live-at-the-kokua-festival-single/66275797?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/99/09/3f/99093f88-4365-1548-34e2-017f77b89ac3/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/99/09/3f/99093f88-4365-1548-34e2-017f77b89ac3/source/100x100bb.jpg\", \"collectionPrice\":2.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":2, \"copyright\":\"℗ 2005 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2005-01-01T08:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":79223185, \"collectionId\":278985055, \"amgArtistId\":649174, \"artistName\":\"Zach Gill & Jack Johnson\", \"collectionName\":\"Family - Single\", \"collectionCensoredName\":\"Family - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/zach-gill/79223185?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/family-single/278985055?uo=4\", \"artworkUrl60\":\"http://is1.mzstatic.com/image/thumb/Music/v4/83/69/6a/83696a73-d8f0-1d97-e119-bb15b8c33d86/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is1.mzstatic.com/image/thumb/Music/v4/83/69/6a/83696a73-d8f0-1d97-e119-bb15b8c33d86/source/100x100bb.jpg\", \"collectionPrice\":0.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":2, \"copyright\":\"℗ 2008 Brushfire Records\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2008-04-29T07:00:00Z\", \"primaryGenreName\":\"Rock\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":474585064, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"In the Morning - Single\", \"collectionCensoredName\":\"In the Morning - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/in-the-morning-single/474585064?uo=4\", \"artworkUrl60\":\"http://is3.mzstatic.com/image/thumb/Music/v4/07/b5/fb/07b5fbfd-db9e-ea83-ddca-365d6faac48c/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is3.mzstatic.com/image/thumb/Music/v4/07/b5/fb/07b5fbfd-db9e-ea83-ddca-365d6faac48c/source/100x100bb.jpg\", \"collectionPrice\":1.29, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":1, \"copyright\":\"℗ 2011 Brushfire Records\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2011-11-01T07:00:00Z\", \"primaryGenreName\":\"Holiday\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":66834334, \"collectionId\":525958892, \"amgArtistId\":97745, \"artistName\":\"Ted Lennon\", \"collectionName\":\"So in Love (Acoustic Remix) [feat. Jack Johnson & Colbie Caillat] - Single\", \"collectionCensoredName\":\"So in Love (Acoustic Remix) [feat. Jack Johnson & Colbie Caillat] - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/ted-lennon/66834334?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/so-in-love-acoustic-remix-feat-jack-johnson-colbie/525958892?uo=4\", \"artworkUrl60\":\"http://is2.mzstatic.com/image/thumb/Music/v4/ff/d6/10/ffd610d2-b3b4-8427-3e25-c79e3022aa44/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is2.mzstatic.com/image/thumb/Music/v4/ff/d6/10/ffd610d2-b3b4-8427-3e25-c79e3022aa44/source/100x100bb.jpg\", \"collectionPrice\":0.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":1, \"copyright\":\"℗ 2012 Ted Lennon\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2012-05-11T07:00:00Z\", \"primaryGenreName\":\"Pop\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":272783448, \"collectionId\":663930937, \"artistName\":\"Manuel Garcia, Silvia Tómas, Jack Johnson & Paula Fuga\", \"collectionName\":\"Farewell (From \\\"El Mar, Mi Alma\\\") - Single\", \"collectionCensoredName\":\"Farewell (From \\\"El Mar, Mi Alma\\\") - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/author/manuel-garcia/id272783448?mt=11&uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/farewell-from-el-mar-mi-alma-single/663930937?uo=4\", \"artworkUrl60\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/59/71/8b/59718b6a-0162-90e7-e968-7a6004c65535/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is4.mzstatic.com/image/thumb/Music4/v4/59/71/8b/59718b6a-0162-90e7-e968-7a6004c65535/source/100x100bb.jpg\", \"collectionPrice\":0.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":1, \"copyright\":\"℗ 2013 Rebel Waltz Films\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2013-04-02T07:00:00Z\", \"primaryGenreName\":\"Soundtrack\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":772111884, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson & The Roots\", \"collectionName\":\"Rudolph the Red Nosed Reindeer (Live from Late Night with Jimmy Fallon) - Single\", \"collectionCensoredName\":\"Rudolph the Red Nosed Reindeer (Live from Late Night with Jimmy Fallon) - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/rudolph-red-nosed-reindeer-live-from-late-night-jimmy/772111884?uo=4\", \"artworkUrl60\":\"http://is1.mzstatic.com/image/thumb/Music6/v4/b8/60/7f/b8607fd0-cb77-27fb-1798-405dfd45cdea/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is1.mzstatic.com/image/thumb/Music6/v4/b8/60/7f/b8607fd0-cb77-27fb-1798-405dfd45cdea/source/100x100bb.jpg\", \"collectionPrice\":0.99, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":1, \"copyright\":\"℗ 2013 Brushfire Records\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2013-12-10T08:00:00Z\", \"primaryGenreName\":\"Holiday\"}, \n" +
            "{\"wrapperType\":\"collection\", \"collectionType\":\"Album\", \"artistId\":909253, \"collectionId\":1062115538, \"amgArtistId\":468749, \"artistName\":\"Jack Johnson\", \"collectionName\":\"Seasick Dream - Single\", \"collectionCensoredName\":\"Seasick Dream - Single\", \"artistViewUrl\":\"https://itunes.apple.com/us/artist/jack-johnson/909253?uo=4\", \"collectionViewUrl\":\"https://itunes.apple.com/us/album/seasick-dream-single/1062115538?uo=4\", \"artworkUrl60\":\"http://is5.mzstatic.com/image/thumb/Music7/v4/14/21/99/142199f6-5c9f-ff24-f03d-3cb43b221ac4/source/60x60bb.jpg\", \"artworkUrl100\":\"http://is5.mzstatic.com/image/thumb/Music7/v4/14/21/99/142199f6-5c9f-ff24-f03d-3cb43b221ac4/source/100x100bb.jpg\", \"collectionPrice\":1.29, \"collectionExplicitness\":\"notExplicit\", \"trackCount\":1, \"copyright\":\"℗ 2015 Jack Johnson\", \"country\":\"USA\", \"currency\":\"USD\", \"releaseDate\":\"2015-12-01T08:00:00Z\", \"primaryGenreName\":\"Singer/Songwriter\"}]\n" +
            "}\n" +
            "\n" +
            "\n";

    public static final int RESULT_COUNT = 24;
    public static final int RESULT_COUNT_ALBUM = 23;
    public static final int ID_ALBUM_1 = 1;
    public static final String NAME_ALBUM_1 = "name album 1";
    public static final String ARTIST_NAME_1 = "artist name 1";
    public static final String THUMBNAIL_1 = "thumbnail 1";
    public static final int TRACK_COUNT_1 = 14;

    public static Album getAlbum1() {
        return Album.createAlbum(ID_ALBUM_1, NAME_ALBUM_1, ARTIST_NAME_1, THUMBNAIL_1, TRACK_COUNT_1);
    }
}
