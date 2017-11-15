package com.gve.testapplication.apium.albumlist.data;

import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

import java.util.List;

/**
 * Created by gve on 01/11/2017.
 */

@AutoValue
public abstract class JsonPojoAlbum {

    public abstract long time();

    public abstract List<Album> data();

    public static JsonPojoAlbum create(long time, List<Album> albumList) {
        return new AutoValue_JsonPojoAlbum(time, albumList);
    }

    @NonNull
    public static TypeAdapter<JsonPojoAlbum> typeAdapter(@NonNull final Gson gson) {
        return new AutoValue_JsonPojoAlbum.GsonTypeAdapter(gson);
    }
}
