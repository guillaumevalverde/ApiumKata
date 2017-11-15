package com.gve.testapplication.core.data.roomjsonstore;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


/**
 * Created by gve on 15/11/2017.
 */

@Entity(tableName = "roomJsonTable")
public class RoomJson {

    @PrimaryKey
    @NonNull
    private String id;

    @NonNull
    private long timeStamp;

    @NonNull
    private String json;

    public RoomJson(String id, long timeStamp, String json) throws Exception {
        this.id = id;
        this.timeStamp = timeStamp;
        this.json = json;
    }

    public String getId() {
        return id;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getJson() {
        return json;
    }
}
