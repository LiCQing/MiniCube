package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestPage {
    private Integer currentPage;
    private Integer totalPage;
    private Integer pageSize;
    private Object pageData;
}
