package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.car;
import com.edu.pjatk.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<car> listAll(){
        return (List<car>) carRepository.findAll();
    }
}
