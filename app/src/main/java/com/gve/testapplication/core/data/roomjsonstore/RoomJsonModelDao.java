package com.gve.testapplication.core.data.roomjsonstore;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import io.reactivex.Flowable;
import io.reactivex.Single;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

/**
 * Created by gve on 15/11/2017.
 */

@Dao
public interface RoomJsonModelDao {

    @Query("select * from roomJsonTable where id = :id")
    Flowable<RoomJson> getItembyId(String id);

    @Insert(onConflict = REPLACE)
    void add(RoomJson json);

    @Query("delete from roomJsonTable where id = :key")
    void delete(String key);

    @Query("select * from roomJsonTable where id = :id")
    Single<RoomJson> getItembyIdSingle(String id);

}
