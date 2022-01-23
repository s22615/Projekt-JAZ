package com.edu.pjatk.demo.data;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "klient")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klienta")
    private int client_id;

    @Column(nullable = false, length = 32, name = "imie")
    private String name;

    @Column(nullable = false, length = 32, name = "nazwisko")
    private String surname;

    @Column(nullable = false, length = 11, name = "pesel")
    private String pesel;

    @Column(nullable = false, length = 11, name = "nr_tel")
    private String phone_number;

    @Column(nullable = false, length = 10, name = "data_urodzenia")
    private Date birth_date;

    @Column(nullable = false, length = 6, name = "kod_pocztowy")
    private String postal_code;

    @Column(nullable = false, length = 32, name = "miasto")
    private String city;

    @Column(nullable = false, length = 32, name = "ulica")
    private String street;

}
