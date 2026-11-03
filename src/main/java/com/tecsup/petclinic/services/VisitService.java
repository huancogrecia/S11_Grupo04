package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;

import java.util.List;

public interface VisitService {

    List<Visit> findByPetId(Integer petId);

    List<Visit> findByVetId(Integer vetId);

    void delete(Integer id);
}
