package com.walmart.test.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Data
public class SearchRequest {
    @Setter
    @Getter
    private List<String> arrayA;
    @Setter
    @Getter
    private List<String> arrayB;

}
