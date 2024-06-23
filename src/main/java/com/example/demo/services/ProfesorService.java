package com.example.demo.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Profesor;
import com.example.demo.repositories.ProfesorRepository;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository profesorRepository;

    public ArrayList<Profesor> getAll() {
        return (ArrayList<Profesor>) profesorRepository.findAll();
    }

    public Optional<Profesor> getById(Long id) {
        return profesorRepository.findById(id);
    }

    public Profesor save(Profesor profesor) {
        return profesorRepository.save(profesor);
    }

    public Profesor update(Long id, Profesor profesor) {
        Optional<Profesor> existingProfesor = profesorRepository.findById(id);
        if (existingProfesor.isPresent()) {
            profesor.setId(id);
            return profesorRepository.save(profesor);
        }
        return null;
    }

    public void delete(Long id) {
        profesorRepository.deleteById(id);
    }
}
