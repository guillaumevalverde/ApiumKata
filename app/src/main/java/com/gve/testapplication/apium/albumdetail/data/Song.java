package com.gve.testapplication.apium.albumdetail.data;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.gve.testapplication.apium.albumlist.data.Album;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by gve on 15/11/2017.
 */

@AutoValue
public abstract class Song {

    public abstract long id();

    @NonNull
    public abstract String name();

    @NonNull
    public abstract String artistName();

    public abstract long duration();

    public abstract long albumId();

    @NonNull
    private static Song.Builder builder() {
        return new AutoValue_Song.Builder();
    }

    public static Song createSong(long id, @NonNull String name, @NonNull String artistName,
                                   long duration, long albumId) {
        return Song.builder().id(id).name(name).artistName(artistName)
                .duration(duration).albumId(albumId).build();
    }

    public static String timeFromMillis(long millis) {
        long second = (millis / 1000) % 60;
        long minute = (millis / (1000 * 60)) % 60;
        long hour = (millis / (1000 * 60 * 60)) % 24;

        return hour > 0 ? String.format("%02d:%02d:%02d", hour, minute, second)
                : String.format("%02d:%02d", minute, second);
    }

    @NonNull
    public static TypeAdapter<Song> typeAdapter(@NonNull final Gson gson) {
        return new AutoValue_Song.GsonTypeAdapter(gson);
    }

    @AutoValue.Builder
    interface Builder {

        Song.Builder id(long id);

        Song.Builder name(String name);

        Song.Builder artistName(String artistName);

        Song.Builder duration(long duration);

        Song.Builder albumId(long albumId);

        Song build();
    }
}
