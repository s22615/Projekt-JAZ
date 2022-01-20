package com.edu.pjatk.demo.data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class samochod {
    String nr_rejestracyjny;
    String marka;
    String model;
    int rocznik;
    int przebieg;
    int pojemnosc_skokowa;
    String kolor;
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
