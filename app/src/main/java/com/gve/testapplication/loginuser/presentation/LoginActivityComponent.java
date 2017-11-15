package com.gve.testapplication.loginuser.presentation;

import com.gve.testapplication.core.app.SubcomponentBuilder;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by gve on 26/10/2017.
 */

@ActivityScope
@Subcomponent(modules = {LoginActivityModule.class})
public interface LoginActivityComponent {

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<LoginActivityComponent> {
        Builder activityModule(LoginActivityModule module);
    }

    void inject(LoginUserActivity activity);
}
