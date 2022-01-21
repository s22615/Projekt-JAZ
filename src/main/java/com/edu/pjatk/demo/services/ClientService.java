package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.client;
import com.edu.pjatk.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<client> listAll(){
        return (List<client>) clientRepository.findAll();
    }
}
