package com.zpx.delete.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach mycoach;

    @Autowired
    public DemoController(Coach mycoach){
       this.mycoach = mycoach;
    }

    @GetMapping("/dailyworkout")
    public String demoController(){
        return mycoach.dailyworkout();
    }




}
