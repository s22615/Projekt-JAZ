package com.edu.pjatk.demo.data;

import javax.persistence.*;

@Entity
@Table(name = "adres")
public class adress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_adres")
    public int id_adres;

    @Column(nullable = false, length = 6, name = "kod_pocztowy")
    String kod_pocztowy;

    @Column(length = 32, name = "miasto")
    String miasto;

    @Column(length = 32, name = "ulica")
    String ulica;

    public int getId_adres() {
        return id_adres;
    }

    public void setId_adres(int id_adres) {
        this.id_adres = id_adres;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }


}
