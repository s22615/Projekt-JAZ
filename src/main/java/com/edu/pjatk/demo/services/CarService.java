package com.edu.pjatk.demo.services;

import com.edu.pjatk.demo.data.Car;
import com.edu.pjatk.demo.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> listAll(){
        return (List<Car>) carRepository.findAll();
    }

    public void save(Car car) {
        carRepository.save(car);
    }
    public int returnLastCarId(){
        long count = listAll().stream().count();
        return listAll().stream().skip(count - 1).findFirst().get().getCar_id();
    }
}
