package com.acrinews.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import org.springframework.validation.annotation.Validated;

@ApiModel(description = "Represents a paginated search result.")
@Validated
public class Pagination {
    @JsonProperty("offset")
    private Integer offset = 0;

    @JsonProperty("limit")
    private Integer limit = 200;

    @JsonProperty("total")
    private Integer total = null;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}
