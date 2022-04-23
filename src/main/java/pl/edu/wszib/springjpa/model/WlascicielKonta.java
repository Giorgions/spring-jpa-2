package pl.edu.wszib.springjpa.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class WlascicielKonta {

    @Id
    @GeneratedValue
    private Integer id;

    private String imie;

    private String nazwisko;

    @ManyToMany(mappedBy = "wlasciciele", fetch = FetchType.EAGER)
    private List<Konto> konta;

}
