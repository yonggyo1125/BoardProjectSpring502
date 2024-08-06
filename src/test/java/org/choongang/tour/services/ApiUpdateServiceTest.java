package org.choongang.tour.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ApiUpdateServiceTest {

    @Autowired
    private ApiUpdateService updateService;

    @Test
    void test1() {
        updateService.update();
    }
}
