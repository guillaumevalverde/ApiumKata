package com.gve.testapplication.articledetail.data;


import com.gve.testapplication.articlelist.data.Article;

import io.reactivex.Flowable;
import io.reactivex.Single;

/**
 * Created by gve on 07/11/2017.
 */

public interface ArticleStoreInterface {

    Flowable<Article> getArticleFlowable(int id);

    void saveArticle(Article article);

    void deleteArticle(Article article);

    Single<Article> getArticleSingle(int id);
}
