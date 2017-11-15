package com.gve.testapplication.core.data;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;

import java.util.List;

import io.reactivex.Flowable;

public interface ReactiveStore<Value> {

    void storeSingular(@NonNull Value model) throws Exception;

    void storeAll(@NonNull List<Value> modelList) throws Exception;

    void replaceAll(@NonNull List<Value> modelList) throws Exception;

    Flowable<Pair<Long, Value>> getSingular(@NonNull String key);

    Flowable<List<Pair<Long, Value>>> getAll();
}
