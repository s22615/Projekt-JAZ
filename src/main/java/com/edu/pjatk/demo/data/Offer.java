package com.edu.pjatk.demo.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "oferta")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id_oferty")
    private Integer offer_id;

    @Column(nullable = false, name = "cena")
    private float prize;

    @Column(nullable = false, length = 10, name = "data_wystawienia")
    private Date start_date;

    @Column(nullable = false, name = "id_samochodu")
    private int car_id;

    @Column(nullable = false, name = "id_klienta")
    private int client_id;

}
