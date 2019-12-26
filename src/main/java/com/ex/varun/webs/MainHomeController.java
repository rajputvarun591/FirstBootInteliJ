package com.ex.varun.webs;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainHomeController {

    @RequestMapping("/home")
    public String showMainHome(){
        return  "Hello";
    }
}
