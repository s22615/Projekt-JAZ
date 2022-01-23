package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.Car;
import com.edu.pjatk.demo.data.Offer;
import com.edu.pjatk.demo.repositories.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferService {

    @Autowired
    private OfferRepository offerRepository;

    @Autowired
    private ClientService clientService;

    @Autowired
    private CarService carService;

    public List<Offer> listAll(){
        return (List<Offer>) offerRepository.findAll();
    }

    public void save(Offer offer) {
        offer.setClient_id(clientService.returnlastclientid());
        offer.setCar_id(carService.returnLastCarId());
        offerRepository.save(offer);
    }
}
