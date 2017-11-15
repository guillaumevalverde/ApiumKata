package com.gve.testapplication.articledetail.domain;

import com.gve.testapplication.articledetail.data.ArticleDetailRepo;
import com.gve.testapplication.articlelist.data.Article;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by gve on 07/11/2017.
 */

public class DetailArticleViewModel {

    private ArticleDetailRepo articleRepo;

    public DetailArticleViewModel(ArticleDetailRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    public Completable fetchArticle(int id) {
        return articleRepo.fetch(id)
                .subscribeOn(Schedulers.io());
    }

    public Flowable<Article> getArticleFlowable(int id) {
        return articleRepo.getStream(id);
    }

    public Single<Article> getArticleSingle(int id) {
        return articleRepo.getSingle(id);
    }


    public Completable changeFavourite(int id) {
        return articleRepo.getSingle(id)
                .map(Article::getArticleFavoChanged)
                .doOnSuccess(articleRepo::store)
                .subscribeOn(Schedulers.computation())
                .toCompletable();
    }
}
