package com.gve.testapplication.loginuser.data;

import io.reactivex.Single;

/**
 * Created by gve on 06/11/2017.
 */

public interface UserAPI {

    Single<User> getUser(String username);
}
