package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.client;
import com.edu.pjatk.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String showClients(Model model){
        List<client> clientsList = clientService.listAll();
        model.addAttribute("clientsList",clientsList);
        return "clients";
    }
}
