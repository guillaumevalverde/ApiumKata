package com.gve.testapplication.core.data.roomjsonstore;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import com.gve.testapplication.core.data.AppDataBase;
import com.gve.testapplication.core.data.ReactiveStore;

import org.apache.commons.lang3.NotImplementedException;

import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import javax.inject.Inject;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;

/**
 * Created by gve on 15/11/2017.
 */

public class RoomJsonStore<Value> implements ReactiveStore<Value> {

    private AppDataBase appDataBase;
    private Function<String, Value> getObjFromJson;
    private Function<Value, String> getJsonFromObj;
    Function<Value, String> getKey;
    private Callable<String> getEmptyValue;

    @Inject
    public RoomJsonStore(AppDataBase appDataBase,
                         Function<Value, String> getKey,
                         Function<String, Value> getObjFromJson,
                         Function<Value, String> getJsonFromObj,
                         Callable<String> getEmptyValue) {
        this.appDataBase = appDataBase;
        this.getJsonFromObj = getJsonFromObj;
        this.getObjFromJson = getObjFromJson;
        this.getKey = getKey;
        this.getEmptyValue = getEmptyValue;
    }

    public static Callable<Long> getTime() {
        Date date = new Date();
        return date::getTime;
    }

    @Override
    public void storeSingular(@NonNull Value model) throws Exception {
        RoomJson roomJson = new RoomJson(getKey.apply(model), getTime().call(),
                getJsonFromObj.apply(model));
        appDataBase.roomJsonModel().add(roomJson);
    }

    @Override
    public Flowable<Pair<Long, Value>> getSingular(@NonNull String key) {

        Flowable<RoomJson> first = appDataBase.roomJsonModel().getItembyIdSingle(key).toFlowable()
                .onErrorReturn(throwable -> RoomJson.getEmptyRoom(getEmptyValue));

        Flowable<RoomJson> second = appDataBase.roomJsonModel()
                .getItembyId(key);

        return  Flowable.concat(first, second)
                .map(roomJson -> new Pair<Long, Value>(roomJson.getTimeStamp(),
                        getObjFromJson.apply(roomJson.getJson())));
    }

    @Override
    public void storeAll(@NonNull List<Value> modelList) throws Exception {
        throw new NotImplementedException("not used");
    }

    @Override
    public void replaceAll(@NonNull List<Value> modelList) throws Exception {
        throw new NotImplementedException("not used");
    }

    @Override
    public Flowable<List<Pair<Long, Value>>> getAll() {
        throw new NotImplementedException("not used");
    }
}
