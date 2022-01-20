package com.edu.pjatk.demo.data;

import javax.persistence.*;

@Entity
@Table(name = "klient")
public class klient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_klienta")
    public int id_klienta;

    @Column(nullable = false, length = 32, name = "imie")
    String imie;

    @Column(nullable = false, length = 32, name = "nazwisko")
    String nazwisko;

    @Column(nullable = false, length = 11, name = "pesel")
    String pesel;

    @Column(length = 11, name = "nr_tel")
    String nr_tel;

    @Column(length = 10, name = "data_urodzenia")
    String date;

    // make foreign keys with onetoone anno etc.
    @Column(nullable = false, name = "adres")
    int adres;

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNr_tel() {
        return nr_tel;
    }

    public void setNr_tel(String nr_tel) {
        this.nr_tel = nr_tel;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAdres() {
        return adres;
    }

    public void setAdres(int adres) {
        this.adres = adres;
    }
}
