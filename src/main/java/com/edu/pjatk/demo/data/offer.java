package com.edu.pjatk.demo.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "oferta")
public class offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferty")
    private Integer offer_id;

    @Column(nullable = false, name = "cena")
    private float prize;

    @Column(nullable = false, length = 10, name = "data_wystawienia")
    private String start_date;

    @Column(nullable = false, name = "id_samochodu")
    private String car_id;

    @Column(nullable = false, name = "id_klienta")
    private String client_id;

}
