package org.choongang.tour.controllers;

import org.choongang.global.exceptions.ExceptionProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tour")
public class TourController implements ExceptionProcessor {

    @GetMapping("/view/{id}")
    public String view(@PathVariable("id") Long id, Model model) {

        return "front/tour/view";
    }
}
