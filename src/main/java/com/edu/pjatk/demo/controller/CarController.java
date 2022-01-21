package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.car;
import com.edu.pjatk.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(Model model){
        List<car> carsList = carService.listAll();
        model.addAttribute("carsList", carsList);
        return "cars";
    }
}
