package com.acrinews.api.controller;

import com.acrinews.api.model.ArticleResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

@Api(value="acriNews", description="fetch news articles for fintech leaders")
public class AcriNewsApi {
    Logger log = LoggerFactory.getLogger(AcriNewsApi.class);

    Optional<ObjectMapper> getObjectMapper() {return Optional.empty();}
    Optional<HttpServletRequest> getRequest() { return Optional.empty(); }

    Optional<String> getAcceptHeader() { return getRequest().map(r -> r.getHeader("Accept")); }

    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Fetched articles successfully", response = AcriNewsApi.class) })
    @RequestMapping(value = "/getArticles",
            produces = { "application/json" },
            method = RequestMethod.GET)
    ResponseEntity<ArticleResponse> getArticles (@ApiParam(value = "title of the article") @RequestParam(value = "title", required = false) String title,
                                                 @ApiParam(value = "keywords") @RequestParam(value = "keywords", required = false) List<String> keywords,
                                                 @RequestParam(value = "limit", required = false) Integer limit) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
