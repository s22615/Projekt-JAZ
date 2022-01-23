package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.Client;
import com.edu.pjatk.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listAll(){
        return (List<Client>) clientRepository.findAll();
    }

    public void save(Client client) {
        clientRepository.save(client);
    }

    public int returnlastclientid(){
        long count = listAll().stream().count();
        return listAll().stream().skip(count - 1).findFirst().get().getClient_id();
    }

    public Client findClientById(Integer id) {
        return clientRepository.findById(id).get();
    }
}
