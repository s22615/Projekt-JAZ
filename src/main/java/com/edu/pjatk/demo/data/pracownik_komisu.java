package com.edu.pjatk.demo.data;

import javax.persistence.*;

@Entity
@Table(name = "pracownik_komisu")
public class pracownik_komisu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pracownika")
    int id_pracownika;

    @Column(nullable = false, length = 32, name = "imie")
    String imie;

    @Column(nullable = false, length = 32, name = "nazwisko")
    String nazwisko;

    @Column(nullable = false, length = 11, name = "pesel")
    String pesel;

    // make foreign keys with onetoone anno etc.
    @Column(nullable = false, name = "adres")
    int adres;

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
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

    public int getAdres() {
        return adres;
    }

    public void setAdres(int adres) {
        this.adres = adres;
    }

}
