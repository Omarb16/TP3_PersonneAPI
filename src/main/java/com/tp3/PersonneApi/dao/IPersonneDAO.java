package com.tp3.PersonneApi.dao;

import com.tp3.PersonneApi.model.Personne;

import java.util.List;

public interface IPersonneDAO {

    public Personne findById(int id);

    public List<Personne> getAll();

    public Personne update(int id, Personne personne);

    public boolean create(Personne personne);

    public boolean delete(int id);
}
