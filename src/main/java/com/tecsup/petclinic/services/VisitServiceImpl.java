package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import com.tecsup.petclinic.repositories.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VisitServiceImpl implements VisitService {

    private final VisitRepository visitRepository;

    @Override
    public Visit create(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Visit update(Visit visit) {
        return visitRepository.save(visit);
    }

    @Override
    public Optional<Visit> findById(Integer id) {
        return visitRepository.findById(id);
    }

    @Override
    public List<Visit> findByPetId(Integer petId) {
        return visitRepository.findByPetId(petId);
    }

    @Override
    public List<Visit> findByVetId(Integer vetId) {
        return visitRepository.findByVetId(vetId);
    }

    @Override
    public void delete(Integer id) {
        visitRepository.deleteById(id);
    }
}
