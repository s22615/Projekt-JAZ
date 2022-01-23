package com.edu.pjatk.demo.controller;

import com.edu.pjatk.demo.data.Client;
import com.edu.pjatk.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/clients")
    public String showClients(Model model){
        List<Client> clientsList = clientService.listAll();
        model.addAttribute("clientsList",clientsList);
        return "clients";
    }

    @GetMapping("/clients/new")
    public String showNewClients(Model model){
        model.addAttribute("client", new Client());
        return "client_form";
    }

    @PostMapping("/clients/save")
    public String saveUser(Client client){
        clientService.save(client);
        return "redirect:/cars/new";
    }
}
