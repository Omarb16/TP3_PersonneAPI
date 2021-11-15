package com.tp3.PersonneApi.dao;

import com.tp3.PersonneApi.model.Personne;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonneDAO implements IPersonneDAO {

    List<Personne> personnes;

    public PersonneDAO() {
        this.personnes = new ArrayList<Personne>();
        this.personnes.add(new Personne(1, "nom1", 20,"nationality1"));
        this.personnes.add(new Personne(2, "nom1", 21,"nationality2"));
        this.personnes.add(new Personne(3, "nom1", 22,"nationality3"));
        this.personnes.add(new Personne(4, "nom1", 23,"nationality4"));
    }

    public Personne findById(int id) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }

    public List<Personne> getAll() {
        return this.personnes;
    }

    public Personne update(int id, Personne personne) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                p.setNom(personne.getNom());
                p.setAge(personne.getAge());
                p.setNationality(personne.getNationality());
                return p;
            }
        }
        return null;
    }

    public boolean create(Personne personne) {
        for (Personne p : this.personnes) {
            if (personne.getId() == p.getId()) {
                return false;
            }
        }
        return this.personnes.add(personne);
    }

    public boolean delete(int id) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                return this.personnes.remove(p);
            }
        }
        return false;
    }
}
