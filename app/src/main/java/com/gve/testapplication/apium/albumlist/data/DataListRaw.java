package com.gve.testapplication.apium.albumlist.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by gve on 14/11/2017.
 */

public class DataListRaw {

    @SerializedName("results")
    private List<DataRaw> dataRawList;

    public List<DataRaw> getDataRawList() {
        return dataRawList;
    }
}
