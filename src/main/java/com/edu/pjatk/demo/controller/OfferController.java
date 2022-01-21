package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.offer;
import com.edu.pjatk.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/offers")
    public String showoffers(Model model){
        List<offer> offersList = offerService.listAll();
        model.addAttribute("offersList", offersList);
        return "offers";
    }
}
