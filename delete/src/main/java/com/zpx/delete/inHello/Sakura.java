package com.zpx.delete.inHello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sakura {

    @Autowired
    private Naruto hokage;

    public Sakura(Naruto myhokage) {
        myhokage = hokage;
    }

    @GetMapping("/naruto")
    public String getDatebayo(){
        return hokage.datebayo();
    }

}


