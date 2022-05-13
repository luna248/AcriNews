package com.acrinews.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Source {
    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Source{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}