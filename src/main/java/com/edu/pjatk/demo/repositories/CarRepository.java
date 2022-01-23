package com.edu.pjatk.demo.repositories;

import com.edu.pjatk.demo.data.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, String> {
}
