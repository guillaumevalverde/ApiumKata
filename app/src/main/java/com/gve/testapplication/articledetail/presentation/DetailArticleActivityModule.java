package com.gve.testapplication.articledetail.presentation;

import android.content.Context;

import com.gve.testapplication.articledetail.data.ArticleDetailRepo;
import com.gve.testapplication.articledetail.domain.DetailArticleViewModel;
import com.gve.testapplication.core.injection.qualifiers.ForActivity;
import com.gve.testapplication.core.injection.scopes.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by gve on 26/10/2017.
 */

@Module
public class DetailArticleActivityModule {

    @ForActivity
    private Context context;

    public DetailArticleActivityModule(Context context) {
        this.context = context;
    }

    @Provides
    @ActivityScope
    @ForActivity
    public Context getContext() {
        return context;
    }

    @Provides
    @ActivityScope
    public DetailArticleViewModel provide(ArticleDetailRepo articleRepo) {
        return new DetailArticleViewModel(articleRepo);
    }
}
