package com.edu.pjatk.demo.data;

import javax.persistence.*;

@Entity
@Table(name = "oferta")
public class oferta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_oferty")
    int id_oferty;

    @Column(nullable = false, name = "cena")
    float cena;

    @Column(nullable = false, length = 10, name = "data_wystawienia")
    String data_wystawienia;

    // make foreign keys with onetoone anno etc.
    @Column(nullable = false, length = 7, name = "nr_rejestracyjny")
    String nr_rejestracyjny;

    public int getId_oferty() {
        return id_oferty;
    }

    public void setId_oferty(int oferta) {
        this.id_oferty = oferta;
    }

    public float getCena() {
        return cena;
    }

    public void setCena(float cena) {
        this.cena = cena;
    }

    public String getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(String data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }

    public String getNr_rejestracyjny() {
        return nr_rejestracyjny;
    }

    public void setNr_rejestracyjny(String nr_rejestracyjny) {
        this.nr_rejestracyjny = nr_rejestracyjny;
    }

}
