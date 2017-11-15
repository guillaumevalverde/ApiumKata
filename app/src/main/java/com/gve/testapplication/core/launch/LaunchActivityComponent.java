package com.gve.testapplication.core.launch;

import com.gve.testapplication.core.app.SubcomponentBuilder;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by gve on 26/10/2017.
 */

@ActivityScope
@Subcomponent(modules = {LaunchActivityModule.class})
public interface LaunchActivityComponent {

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<LaunchActivityComponent> {
        Builder activityModule(LaunchActivityModule module);
    }

    void inject(LaunchActivity activity);
}
