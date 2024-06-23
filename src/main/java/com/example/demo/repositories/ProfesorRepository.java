package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Profesor;
@Repository
public interface ProfesorRepository extends CrudRepository<Profesor,Long> {
}

