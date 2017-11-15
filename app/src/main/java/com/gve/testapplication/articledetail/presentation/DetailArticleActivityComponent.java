package com.gve.testapplication.articledetail.presentation;

import com.gve.testapplication.core.app.SubcomponentBuilder;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Subcomponent;

/**
 * Created by gve on 26/10/2017.
 */

@ActivityScope
@Subcomponent(modules = {DetailArticleActivityModule.class})
public interface DetailArticleActivityComponent {

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<DetailArticleActivityComponent> {
        Builder activityModule(DetailArticleActivityModule module);
    }

    void inject(DetailArticleActivity activity);
}
