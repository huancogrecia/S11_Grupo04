package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;

import java.util.Optional;

public interface VisitService {

    Visit create(Visit visit);

    Visit update(Visit visit);

    Optional<Visit> findById(Integer id);
}
