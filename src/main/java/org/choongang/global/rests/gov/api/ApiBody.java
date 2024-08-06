package org.choongang.global.rests.gov.api;

import lombok.Data;

@Data
public class ApiBody {
    private ApiItems items;
    private Integer numOfRows;
    private Integer pageNo;
    private Integer totalCount;
}
