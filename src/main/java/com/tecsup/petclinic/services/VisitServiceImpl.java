package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import com.tecsup.petclinic.repositories.VisitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

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
}
