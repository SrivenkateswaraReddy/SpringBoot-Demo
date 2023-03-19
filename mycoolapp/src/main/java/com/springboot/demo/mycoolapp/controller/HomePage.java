package com.springboot.demo.mycoolapp.controller;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {

    // expose "/" that return "Hello World"

//    Logger log = LoggerFactory

    @GetMapping("/")
    public String sayHello() {
        return "HelloWorld";
    }

    // expose a new endpoint for workout

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    // exposing new endpoint for fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky Day";
    }

    // exposing new @values coach
    @Value("${coach.name}")
    private String coachName;
    @Value("${player.name}")
    private String playerName;


    @GetMapping("/coach")
    public String getCoachName() {
        return coachName;
    }

    @GetMapping("/player")
    public String getPlayerName() {
        return playerName;
    }
}
