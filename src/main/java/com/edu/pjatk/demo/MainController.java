package com.edu.pjatk.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showWelcomePage(){
        return "welcomepage";
    }


}
