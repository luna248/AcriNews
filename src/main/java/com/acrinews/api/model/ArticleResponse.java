package com.acrinews.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ArticleResponse {
    @JsonProperty("pagination")
    private Pagination pagination = null;

    @JsonProperty("results")
    private List<GnewsArticlesModel> results;

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<GnewsArticlesModel> getResults() {
        return results;
    }

    public void setResults(List<GnewsArticlesModel> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "ArticleResponse{" +
                "pagination=" + pagination +
                ", results=" + results +
                '}';
    }
}
