package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.Offer;
import com.edu.pjatk.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class OfferController {

    @Autowired
    private OfferService offerService;

    @GetMapping("/offers")
    public String showoffers(Model model){
        List<Offer> offersList = offerService.listAll();
        model.addAttribute("offersList", offersList);
        return "offers";
    }

    @GetMapping("/offers/new")
    public String showNewOffer(Model model){
        model.addAttribute("offer", new Offer());
        return "offer_form";
    }

    @PostMapping("/offers/save")
    public String saveOffer(Offer offer){
        offerService.save(offer);
        return "redirect:/offers";
    }
}
