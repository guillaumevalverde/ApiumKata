package com.gve.testapplication.apium.albumlist.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Created by gve on 14/11/2017.
 */

@AutoValue
public abstract class DataRaw {

    @Nullable
    public abstract String wrapperType();

    @Nullable
    public abstract String collectionType();

    @Nullable
    public abstract Integer collectionId();

    @Nullable
    public abstract Integer artistId();

    @Nullable
    public abstract String artistName();

    @Nullable
    public abstract String collectionName();

    @Nullable
    public abstract Integer trackCount();

    @Nullable
    public abstract String artworkUrl100();

    @Nullable
    public abstract String trackName();

    @Nullable
    public abstract Long trackTimeMillis();

    @Nullable
    public abstract Long trackId();

    @NonNull
    public static DataRaw.Builder builder() {
        return new AutoValue_DataRaw.Builder();
    }

    @NonNull
    public static TypeAdapter<DataRaw> typeAdapter(@NonNull final Gson gson) {
        return new AutoValue_DataRaw.GsonTypeAdapter(gson);
    }

    public static boolean isAlbum(DataRaw dataRaw) {
        return dataRaw.collectionType() != null
                && dataRaw.wrapperType() != null
                && dataRaw.wrapperType().contentEquals(ConstItunes.WRAPPER_COLLECTION_TYPE)
                && dataRaw.collectionType().contentEquals(ConstItunes.COLLECTION_ALBUM_TYPE);
    }

    public static boolean isSong(DataRaw dataRaw) {
        return dataRaw.wrapperType() != null
                && dataRaw.wrapperType().contentEquals(ConstItunes.WRAPPER_SONG_TYPE);
    }

    @AutoValue.Builder
    public interface Builder {

        DataRaw.Builder wrapperType(String wrapperType);

        DataRaw.Builder collectionType(String collectionType);

        DataRaw.Builder collectionId(Integer collectionId);

        DataRaw.Builder artistId(Integer artistId);

        DataRaw.Builder artistName(String artistName);

        DataRaw.Builder collectionName(String collectionName);

        DataRaw.Builder trackCount(Integer trackCount);

        DataRaw.Builder artworkUrl100(String artworkUrl100);

        DataRaw.Builder trackTimeMillis(Long trackTimeMillis);

        DataRaw.Builder trackId(Long trackId);

        DataRaw.Builder trackName(String trackName);

        DataRaw build();
    }

    public String toString(){
        return "DataRaw: wrapperType: " + wrapperType() + ", collectionType: " + collectionType()
                + ", collectionId: " + collectionId() + ", artistId: " + artistId() + "\n"
                + ", artistName: " + artistName() + ", collectionName: " + collectionName()
                + ", trackCount: " + trackCount() + ", artworkUrl100: " + artworkUrl100();
    }
}
