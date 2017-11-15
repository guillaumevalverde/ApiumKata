package com.gve.testapplication.apium.albumlist.data;

import com.gve.testapplication.articlelist.data.ArticleDetailRaw;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by gve on 02/11/2017.
 */

public interface RetrofitItunesApiService {

    @GET("lookup?id=&entity=album")
    Single<DataListRaw> getListAlbum(@Query("id") String id);

    @GET("lookup?id=&entity=song")
    Single<ArticleDetailRaw> getSongs(@Query("id") String id);
}
