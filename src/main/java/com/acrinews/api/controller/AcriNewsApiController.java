package com.acrinews.api.controller;

import com.acrinews.api.model.ArticleResponse;
import com.acrinews.api.model.GNewsFetchModel;
import com.acrinews.api.model.Pagination;
import com.acrinews.api.service.AcrinewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AcriNewsApiController extends AcriNewsApi {
    @Autowired
    AcrinewsService acrinewsService;

    @GetMapping("/getArticles")
    ResponseEntity<ArticleResponse> getArticles (@RequestParam(value = "title", required = false) String title,
                                                 @RequestParam(value = "keywords", required = false) List<String> keywords,
                                                 @RequestParam(value = "limit", required = false) Integer limit ){
        log.info("HITS");
        ArticleResponse articleResponse = new ArticleResponse();
        GNewsFetchModel articleList = acrinewsService.getArticles(title, keywords, limit);
        articleResponse.setResults(articleList.getArticles());

        Pagination pagination = new Pagination();
        pagination.setTotal(articleList.getTotalArticles());
        pagination.setLimit(limit);
        articleResponse.setPagination(pagination);

        return new ResponseEntity<>(articleResponse, HttpStatus.OK);
    }

}
