package org.choongang.tour.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;

@Data
@Entity
@Builder
@NoArgsConstructor @AllArgsConstructor
public class TourPlace extends BaseEntity {
    @Id
    private Long contentId;
    private Long contentTypeId;

    @Column(length=30)
    private String category1;

    @Column(length=30)
    private String category2;

    @Column(length=30)
    private String category3;

    @Column(length=100)
    private String title;

    @Column(length=120)
    private String tel;

    @Column(length=150)
    private String address;

    @Column(length=20)
    private String areaCode;

    private boolean bookTour;
    private Double distance;

    private String firstImage;
    private String firstImage2;

    @Column(length=30)
    private String cpyrhtDivCd;
    private Double latitude; // mapy
    private Double longitude; // mapx
    private Integer mapLevel;
    private Integer sigugunCode;
}
