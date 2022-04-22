package pl.edu.wszib.springjpa.model;

import java.util.List;

public class Autor {

  private Integer id;
  private String imie;
  private String nazwisko;
  private List<Ksiazka> ksiazki;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
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

  public List<Ksiazka> getKsiazki() {
    return ksiazki;
  }

  public void setKsiazki(List<Ksiazka> ksiazki) {
    this.ksiazki = ksiazki;
  }
}
