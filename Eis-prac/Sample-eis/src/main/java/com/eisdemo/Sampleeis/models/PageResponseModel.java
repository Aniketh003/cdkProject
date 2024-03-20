package com.eisdemo.Sampleeis.models;


import lombok.*;

import java.util.List;

@NoArgsConstructor
@Data
public class PageResponseModel {
    private List<ResponseModel> content;
    private int pageNumber;
    private int pageSize;
    private int totalPages;
    private long totalElements;

    public PageResponseModel(List<ResponseModel> content, int pageNumber, int pageSize, int totalPages, long totalElements) {
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
    }
}