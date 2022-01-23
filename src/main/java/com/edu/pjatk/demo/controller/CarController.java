package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.Car;
import com.edu.pjatk.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String showCars(Model model){
        List<Car> carsList = carService.listAll();
        model.addAttribute("carsList", carsList);
        return "cars";
    }

    @GetMapping("/cars/new")
    public String showNewCars(Model model){
        model.addAttribute("car", new Car());
        return "car_form";
    }

    @PostMapping("/cars/save")
    public String saveCar(Car car){
        carService.save(car);
        return "redirect:/offers/new";
    }
}
