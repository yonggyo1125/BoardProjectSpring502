package org.choongang.tour.services;

import lombok.RequiredArgsConstructor;
import org.choongang.tour.controllers.TourPlaceSearch;
import org.choongang.tour.entities.TourPlace;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TourPlaceInfoService {

    private final RestTemplate restTemplate;

    public List<TourPlace> getList(TourPlaceSearch search) {

        return null;
    }
}
