package com.acrinews.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class GNewsFetchModel {
    @JsonProperty("totalArticles")
    private Integer totalArticles;

    @JsonProperty("articles")
    private List<GnewsArticlesModel> articles;

    public Integer getTotalArticles() {
        return totalArticles;
    }

    public void setTotalArticles(Integer totalArticles) {
        this.totalArticles = totalArticles;
    }

    public List<GnewsArticlesModel> getArticles() {
        return articles;
    }

    public void setArticles(List<GnewsArticlesModel> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "GNewsFetchModel{" +
                "totalArticles=" + totalArticles +
                ", articles=" + articles +
                '}';
    }
}
