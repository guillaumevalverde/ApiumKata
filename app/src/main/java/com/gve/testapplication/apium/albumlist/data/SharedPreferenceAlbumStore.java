package com.gve.testapplication.apium.albumlist.data;

import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import com.google.gson.Gson;
import com.gve.testapplication.core.data.ReactiveStore;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.subjects.BehaviorSubject;

/**
 * Created by gve on 31/10/2017.
 */

public class SharedPreferenceAlbumStore implements ReactiveStore<List<Album>> {

    public static final String JSON_EMPTY = "{\"time\":0,\"data\":[]}";
    private SharedPreferences sharedPreferences;
    private Gson gson;
    private BehaviorSubject<String> jsonPublish = BehaviorSubject.create();
    private final String keyInSharedPref;
    private SharedPreferences.OnSharedPreferenceChangeListener listener;

    public SharedPreferenceAlbumStore(SharedPreferences sharedPreference,
                                      final String keyInSharedPred,
                                      Gson gson) {
        this.sharedPreferences = sharedPreference;
        this.gson = gson;
        this.keyInSharedPref = keyInSharedPred;
        listener = (prefs, key) ->
                jsonPublish
                        .onNext(sharedPreferences.getString(keyInSharedPred, JSON_EMPTY));
        jsonPublish.onNext(sharedPreferences.getString(keyInSharedPred, JSON_EMPTY));
        sharedPreferences.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override
    public void storeSingular(@NonNull List<Album> modelList) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        try {
            editor.putString(keyInSharedPref, getJsonFromList(modelList, gson, getTime()));
            editor.apply();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void storeAll(@NonNull List<List<Album>> modelList) throws Exception {
        throw new Exception();
    }

    @Override
    public void replaceAll(@NonNull List<List<Album>> modelList) throws Exception {
        throw new Exception();
    }

    @Override
    public Flowable<Pair<Long, List<Album>>> getSingular(@NonNull String key) {
        return jsonPublish.toFlowable(BackpressureStrategy.LATEST)
                .map(ims -> {
                    JsonPojoAlbum jsonPojo = getListFromJson(ims, gson);
                    return new Pair<Long, List<Album>>(jsonPojo.time(), jsonPojo.data());
                });
    }

    @Override
    public Flowable<List<Pair<Long, List<Album>>>> getAll() {
        return null;
    }

    public static String getJsonFromIm(Album album,
                                       Gson gson) {
        return gson.toJson(album);
    }

    public static String getJsonFromList(List<Album> albumList,
                                         Gson gson,
                                         Callable<Long> getTime) throws Exception {
        return gson.toJson(new AutoValue_JsonPojoAlbum(getTime.call(), albumList));
    }

    public static JsonPojoAlbum getListFromJson(String json,
                                                Gson gson) {
        return gson.fromJson(json, JsonPojoAlbum.class);
    }

    public static Callable<Long> getTime() {
        Date date = new Date();
        return date::getTime;
    }

}
