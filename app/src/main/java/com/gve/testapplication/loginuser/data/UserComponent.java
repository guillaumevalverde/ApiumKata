package com.gve.testapplication.loginuser.data;

import com.gve.testapplication.core.injection.scopes.UserScope;

import dagger.Subcomponent;

/**
 * Created by gve on 06/11/2017.
 */


@UserScope
@Subcomponent(modules = {UserModule.class})
public interface UserComponent {

    @Subcomponent.Builder
    interface Builder {
        Builder userModule(UserModule userModule);

        UserComponent build();
    }
}
