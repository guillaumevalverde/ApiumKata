package com.gve.testapplication.core.app;

import com.gve.testapplication.apium.albumdetail.presentation.ListSongActivityComponent;
import com.gve.testapplication.apium.albumlist.presentation.ListAlbumActivityComponent;
import com.gve.testapplication.articledetail.presentation.DetailArticleActivityComponent;
import com.gve.testapplication.core.launch.LaunchActivityComponent;
import com.gve.testapplication.loginuser.presentation.LoginActivityComponent;
import com.gve.testapplication.articlelist.presentation.ListArticleActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by gve.
 */

@Module(subcomponents = {
        LoginActivityComponent.class,
        ListArticleActivityComponent.class,
        LaunchActivityComponent.class,
        DetailArticleActivityComponent.class,
        ListAlbumActivityComponent.class,
        ListSongActivityComponent.class,
})

public abstract class ActivityBindingModule {

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(LoginActivityComponent.Builder.class)
    public abstract SubcomponentBuilder loginActivity(LoginActivityComponent.Builder impl);

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(ListArticleActivityComponent.Builder.class)
    public abstract SubcomponentBuilder listArticleActivity(ListArticleActivityComponent.Builder impl);

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(LaunchActivityComponent.Builder.class)
    public abstract SubcomponentBuilder listLaunchActivity(LaunchActivityComponent.Builder impl);

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(DetailArticleActivityComponent.Builder.class)
    public abstract SubcomponentBuilder detailArticleActivity(DetailArticleActivityComponent.Builder impl);

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(ListAlbumActivityComponent.Builder.class)
    public abstract SubcomponentBuilder listAlbumActivity(ListAlbumActivityComponent.Builder impl);

    @Binds @IntoMap
    @DaggerUtil.SubcomponentKey(ListSongActivityComponent.Builder.class)
    public abstract SubcomponentBuilder listSongActivity(ListSongActivityComponent.Builder impl);

}
