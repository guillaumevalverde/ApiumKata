package com.gve.testapplication.core.launch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.gve.testapplication.R;
import com.gve.testapplication.core.app.BootCampApp;
import com.gve.testapplication.loginuser.presentation.LoginUserActivity;
import com.gve.testapplication.core.UserManager;
import com.gve.testapplication.articlelist.presentation.ListArticleActivity;

import javax.inject.Inject;

/**
 * Created by gve on 07/11/2017.
 */

public class LaunchActivity extends Activity {

    @Inject
    UserManager userManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        LaunchActivityComponent.Builder builder = (LaunchActivityComponent.Builder)
                (((BootCampApp) getApplication()).getComponent())
                        .subComponentBuilders()
                        .get(LaunchActivityComponent.Builder.class)
                        .get();
        builder.activityModule(new LaunchActivityModule(this)).build().inject(this);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.empty);

        if (userManager.startUserSession()) {
            Intent intent = new Intent(this, ListArticleActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, LoginUserActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            finish();
            startActivity(intent);
        }
    }
}
