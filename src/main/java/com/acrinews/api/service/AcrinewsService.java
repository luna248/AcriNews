package com.acrinews.api.service;

import com.acrinews.api.model.GNewsFetchModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@Service
public class AcrinewsService {
    Logger log = LoggerFactory.getLogger(AcrinewsService.class);
    public GNewsFetchModel getArticles(String title, List<String> keywords, Integer limit) {
        log.info("HITS2");
        String uri = "https://gnews.io/api/v4/search?token=2dcb17085d622b07c771f537eeeeba8c";

        if(title!= null &&  !title.isEmpty()){
            uri += "&in=title";
            String[] titleSplit = title.split(" ");
            keywords = Arrays.asList(titleSplit);
        }
        log.info("1: {}", uri);

        if(keywords!= null && !keywords.isEmpty()){
            uri += "&q=";
            for(String keyword: keywords){
                uri += keyword + "+";
            }
            uri = uri.substring(0, uri.length()-1);
        } else{
            uri += "&q=example";
        }

        log.info("2: {}", uri);
        if(limit!=null){
            uri += "&max=";
            uri += String.valueOf(limit);
        }
        log.info("3: {}", uri);

        RestTemplate restTemplate = new RestTemplate();
        GNewsFetchModel result = restTemplate.getForObject(uri, GNewsFetchModel.class);

        return result;
    }
}
