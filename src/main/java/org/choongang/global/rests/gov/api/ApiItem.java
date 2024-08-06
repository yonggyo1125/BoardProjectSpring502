package org.choongang.global.rests.gov.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ApiItem {
    private String addr1;
    private String addr2;
    private String areacode;
    private String booktour;
    private String cat1;
    private String cat2;
    private String cat3;
    private Long contentid;
    private Long contenttypeid;

    @JsonFormat(pattern="yyyyMMddHHmmss")
    private LocalDateTime createdtime;

    @JsonFormat(pattern="yyyyMMddHHmmss")
    private LocalDateTime modifiedtime;

    private Double dist;
    private String firstimage;
    private String firstimage2;
    private String cpyrhtDivCd;
    private Double mapx;
    private Double mapy;
    private Integer mlevel;
    private Integer sigungucode;
    private String tel;
    private String title;
}
