package com.gve.testapplication.apium.albumlist.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Created by gve on 14/11/2017.
 */

@AutoValue
public abstract class Album implements Parcelable {

    @NonNull
    public abstract String name();

    @NonNull
    public abstract String artistName();

    @NonNull
    public abstract long id();

    @NonNull
    public abstract String thumbnail();

    @NonNull
    public abstract int trackCount();

    @NonNull
    private static Builder builder() {
        return new AutoValue_Album.Builder();
    }

    public static Album createAlbum(long id, @NonNull String name, @NonNull String artistName,
                                    @NonNull String thumbnail, int trackCount) {
        return Album.builder().id(id).name(name).artistName(artistName)
                .thumbnail(thumbnail).trackCount(trackCount).build();
    }

    @NonNull
    public static TypeAdapter<Album> typeAdapter(@NonNull final Gson gson) {
        return new AutoValue_Album.GsonTypeAdapter(gson);
    }

    @AutoValue.Builder
    interface Builder {

        Album.Builder id(long id);

        Album.Builder name(String name);

        Album.Builder artistName(String artistName);

        Album.Builder thumbnail(String thumbnail);

        Album.Builder trackCount(int trackCount);

        Album build();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id());
        dest.writeString(name());
        dest.writeString(artistName());
        dest.writeString(thumbnail());
        dest.writeInt(trackCount());
    }

    public Album() {
    }

    protected static Album getAlbum(Parcel in) {
        return Album.createAlbum(in.readLong(), in.readString(), in.readString(),
                in.readString(), in.readInt());
    }

    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel source) {
            return Album.getAlbum(source);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };
}
