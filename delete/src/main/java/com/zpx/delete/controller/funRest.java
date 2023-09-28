package com.zpx.delete.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class funRest {

    @Value("${coach.name}")
    public String coachName;

    @Value("$team.name")
    public String teamName;

    @GetMapping("/teaminfo")
    public String getCoachName(){
      return "coach"+ coachName+ "team" + teamName;
    }
}
