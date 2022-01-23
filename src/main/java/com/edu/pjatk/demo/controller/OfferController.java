package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.Offer;
import com.edu.pjatk.demo.exceptions.OfferNotFoundException;
import com.edu.pjatk.demo.services.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/offers/edit/{id}")
    public String editOffer(@PathVariable("id") Integer id, Model model){
        try {
            Offer offer = offerService.get(id);
            model.addAttribute("offer", offer);
            return "offer_form";
        }catch (OfferNotFoundException e){
            return "redirect:/offers";
        }
    }

    @GetMapping("/offers/delete/{id}")
    public String deleteOffer(@PathVariable("id") Integer id){
        offerService.deleteOffer(id);
        return "redirect:/offers";
    }

}
