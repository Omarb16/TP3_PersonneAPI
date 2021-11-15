package com.tp3.PersonneApi.controller;

import java.util.List;

import com.tp3.PersonneApi.dao.IPersonneDAO;
import com.tp3.PersonneApi.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonneController {

    @Autowired
    private IPersonneDAO photoDAO;

    @GetMapping("/Pers")
    public List<Personne> getPers() {
        return photoDAO.getAll();
    }

    @GetMapping("/Pers/{id}")
    public Personne getPers(@PathVariable int id) {
        return photoDAO.findById(id);
    }

    @PutMapping("/Pers/{id}")
    public Personne putPers(@PathVariable int id, @RequestBody Personne p) {
        return photoDAO.update(id, p);
    }

    @PostMapping("/Pers")
    public boolean postPers(@RequestBody Personne p) {
        return photoDAO.create(p);
    }

    @DeleteMapping("/Pers/{id}")
    public boolean deletePers(@PathVariable int id) {
        return photoDAO.delete(id);
    }
}
