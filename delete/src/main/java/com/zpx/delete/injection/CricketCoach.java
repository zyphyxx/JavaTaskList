package com.zpx.delete.injection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyworkout() {
        return "Practice fast bowling for 15 min";
    }
}
