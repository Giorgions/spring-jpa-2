package pl.edu.wszib.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.springjpa.model.Zajęcia;

import java.util.List;

@Repository
public interface ZajeciaDao extends JpaRepository<Zajęcia, Integer> {
    //wszystkie zajecia gdzie jakis student ma na imie X
    // i prowadzacy ma na nazwisko Y

    List<Zajęcia> findAllByStudentImieAndProwadzacyNazwisko(String imie, String nazwisko);
}
