package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.offer;
import com.edu.pjatk.demo.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    public List<offer> listAll(){
        return (List<offer>) offerRepository.findAll();
    }
}
