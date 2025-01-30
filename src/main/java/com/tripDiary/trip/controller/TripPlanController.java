package com.tripDiary.trip.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TripPlanController {

    @GetMapping("/tripdiary/plan")
    public String tripPlan(){
        return "trip/trip_plan";
    }


}
