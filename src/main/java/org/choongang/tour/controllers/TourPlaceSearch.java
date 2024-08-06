package org.choongang.tour.controllers;

import lombok.Data;

@Data
public class TourPlaceSearch {
    private double latitude;
    private double longitude;
    private int radius = 20;
}
