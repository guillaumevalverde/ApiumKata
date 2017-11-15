package com.gve.testapplication.core.launch;

import android.content.Context;

import com.gve.testapplication.core.injection.qualifiers.ForActivity;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gve on 26/10/2017.
 */

@Module
public class LaunchActivityModule {

    @ForActivity
    private Context context;

    public LaunchActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    @ForActivity
    public Context getContext() {
        return context;
    }
}
