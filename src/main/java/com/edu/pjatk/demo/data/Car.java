package com.edu.pjatk.demo.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_samochodu")
    private int car_id;

    @Column(nullable = false, length = 8, name = "numer_rejestracyjny")
    private String registration_number;

    @Column(nullable = false, length = 32, name = "marka")
    private String brand;

    @Column(nullable = false, length = 32, name = "model")
    private String model;

    @Column(nullable = false,length = 16, name = "rocznik")
    private int production_date;

    @Column(nullable = false,length = 6, name = "przebieg")
    private int mileage;

    @Column(nullable = false,length = 4, name = "pojemnosc_skokowa")
    private int cylinder_capacity;

    @Column(nullable = false,length = 16, name = "kolor")
    private String color;

}
