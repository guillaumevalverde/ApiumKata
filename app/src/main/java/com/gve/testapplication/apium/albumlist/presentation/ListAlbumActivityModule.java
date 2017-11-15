package com.gve.testapplication.apium.albumlist.presentation;

import android.content.Context;

import com.gve.testapplication.core.injection.qualifiers.ForActivity;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gve on 26/10/2017.
 */

@Module
public class ListAlbumActivityModule {

    @ForActivity
    private Context context;

    public ListAlbumActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    @ForActivity
    public Context getContext() {
        return context;
    }
}
