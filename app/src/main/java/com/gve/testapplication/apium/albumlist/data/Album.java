package com.gve.testapplication.apium.albumlist.data;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;

/**
 * Created by gve on 14/11/2017.
 */

@AutoValue
public abstract class Album {

    @NonNull
    public abstract String name();

    @NonNull
    public abstract String artistName();

    @NonNull
    public abstract int id();

    @NonNull
    public abstract String thumbnail();

    @NonNull
    public abstract int trackCount();

    @NonNull
    private static Builder builder() {
        return new AutoValue_Album.Builder();
    }

    public static Album createAlbum(int id, @NonNull String name, @NonNull String artistName,
                                    @NonNull String thumbnail, int trackCount) {
        return Album.builder().id(id).name(name).artistName(artistName)
                .thumbnail(thumbnail).trackCount(trackCount).build();
    }



    @AutoValue.Builder
    interface Builder {

        Album.Builder id(int id);

        Album.Builder name(String name);

        Album.Builder artistName(String artistName);

        Album.Builder thumbnail(String thumbnail);

        Album.Builder trackCount(int trackCount);

        Album build();
    }

}
