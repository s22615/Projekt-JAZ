package com.edu.pjatk.demo.data;

import javax.persistence.*;

@Entity
@Table
public class samochod {
    @Id
    @Column(nullable = false, length = 7, name = "nr_rejestracyjny")
    String nr_rejestracyjny;

    @Column(nullable = false, length = 32, name = "marka")
    String marka;

    @Column(nullable = false, length = 32, name = "model")
    String model;

    @Column(length = 16, name = "rocznik")
    int rocznik;

    @Column(length = 6, name = "przebieg")
    int przebieg;

    @Column(length = 4, name = "pojemnosc_skokowa")
    int pojemnosc_skokowa;

    @Column(length = 16, name = "kolor")
    String kolor;

    // make foreign keys with onetoone anno etc.
    @Column(nullable = false, name = "id_wlasciciela")
    int id_wlasciciela;

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        this.nr_rejestracyjny = nr_rejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getPojemnosc_skokowa() {
        return pojemnosc_skokowa;
    }

    public void setPojemnosc_skokowa(int pojemnosc_skokowa) {
        this.pojemnosc_skokowa = pojemnosc_skokowa;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getId_wlasciciela() {
        return id_wlasciciela;
    }

    public void setId_wlasciciela(int id_wlasciciela) {
        this.id_wlasciciela = id_wlasciciela;
    }
}
