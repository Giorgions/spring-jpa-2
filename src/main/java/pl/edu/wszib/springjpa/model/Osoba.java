package pl.edu.wszib.springjpa.model;

import javax.persistence.*;

@Entity
@Table
public class Osoba {

    @Id
    @GeneratedValue
    private Integer id;

    private String imie;

    private String nazwisko;

    @OneToOne(mappedBy = "osoba")
    private Pracownik pracownik;


}
