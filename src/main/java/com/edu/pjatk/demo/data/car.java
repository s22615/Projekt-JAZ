package com.edu.pjatk.demo.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table
public class car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_samochodu")
    private Integer car_id;

    @Column(nullable = false, length = 32, name = "marka")
    private String brand;

    @Column(nullable = false, length = 32, name = "model")
    private String model;

    @Column(nullable = false,length = 16, name = "rocznik")
    private Integer production_date;

    @Column(nullable = false,length = 6, name = "przebieg")
    private Integer mileage;

    @Column(nullable = false,length = 4, name = "pojemnosc_skokowa")
    private Integer cylinder_capacity;

    @Column(nullable = false,length = 16, name = "kolor")
    private String color;

}
