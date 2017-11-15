package com.gve.testapplication.core.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;

import com.google.gson.Gson;
import com.gve.testapplication.BuildConfig;
import com.gve.testapplication.core.data.ReactiveStore;
import com.gve.testapplication.articlelist.data.SharedPreferenceStore;
import com.gve.testapplication.core.injection.qualifiers.ForApplication;
import com.gve.testapplication.loginuser.data.MockUserProvider;
import com.gve.testapplication.loginuser.data.UserAPI;
import com.gve.testapplication.articlelist.data.Article;
import com.squareup.picasso.Picasso;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gve.
 */

@Module
final class DataModule {

    //Picasso library handle the caching of the image in the disk or in the memory.
    @Provides
    @Singleton
    Picasso providePicasso(@ForApplication Context context) {
        Picasso picasso = new Picasso.Builder(context)
                .indicatorsEnabled(BuildConfig.DEBUG)
                .loggingEnabled(BuildConfig.DEBUG)
                .listener(new Picasso.Listener() {
                    @Override
                    public void onImageLoadFailed(Picasso picasso, Uri uri, Exception exception) {
                        exception.printStackTrace();
                    }
                })
                .build();
        Picasso.setSingletonInstance(picasso);
        return picasso;
    }

    @Provides
    @Singleton
    ReactiveStore<Article> provideSharedPrefStore(SharedPreferences sharedPreference,
                                                  Gson gson) {
        return new SharedPreferenceStore(sharedPreference,
                "ARTICLE_LIST",
                gson);
    }

    @Provides
    @Singleton
    UserAPI provideUserAPi() {
        return new MockUserProvider();
    }

}
