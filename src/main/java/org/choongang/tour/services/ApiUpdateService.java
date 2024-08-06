package org.choongang.tour.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ApiUpdateService {

    private final RestTemplate restTemplate;

    private String serviceKey = "CHrWrFoNSLs09ec0iaNNKpj3VuYnP%2BJA5WAtHyPqdDVCdF%2Fn1NB46%2Bfd2NDjlTiNm%2Fw48BE9guQbOo12k2a6wA%3D%3D";

    public void update() {
        String url = String.format("https://apis.data.go.kr/B551011/KorService1/areaBasedList1?MobileOS=AND&MobileApp=test&numOfRows=10&pageNo=1&serviceKey=%s&_type=json", serviceKey);


    }
}
