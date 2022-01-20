package com.edu.pjatk.demo.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transakcja")
public class transakcja {
    @Id
    int id_transakcji;
    int cena_ostateczna;
    String data_transakcji;
    int id_oferty;
    int id_klienta;
    int id_pracownika;

    public int getId_transakcji() {
        return id_transakcji;
    }

    public void setId_transakcji(int id_transakcji) {
        this.id_transakcji = id_transakcji;
    }

    public int getCena_ostateczna() {
        return cena_ostateczna;
    }

    public void setCena_ostateczna(int cena_ostateczna) {
        this.cena_ostateczna = cena_ostateczna;
    }

    public String getData_transakcji() {
        return data_transakcji;
    }

    public void setData_transakcji(String data_transakcji) {
        this.data_transakcji = data_transakcji;
    }

    public int getId_oferty() {
        return id_oferty;
    }

    public void setId_oferty(int id_oferty) {
        this.id_oferty = id_oferty;
    }

    public int getId_klienta() {
        return id_klienta;
    }

    public void setId_klienta(int id_klienta) {
        this.id_klienta = id_klienta;
    }

    public int getId_pracownika() {
        return id_pracownika;
    }

    public void setId_pracownika(int id_pracownika) {
        this.id_pracownika = id_pracownika;
    }

}
