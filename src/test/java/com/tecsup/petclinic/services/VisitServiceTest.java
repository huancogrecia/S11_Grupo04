package com.tecsup.petclinic.services;

import com.tecsup.petclinic.entities.Visit;
import com.tecsup.petclinic.repositories.VisitRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class VisitServiceTest {

    @Mock
    private VisitRepository visitRepository;

    @InjectMocks
    private VisitServiceImpl visitService;

    @Test
    void testFindByPetId() {
        Integer petId = 7;
        List<Visit> expectedVisits = List.of(
                visit(1, petId, 2, "rabies shot"),
                visit(4, petId, 3, "spayed")
        );
        when(visitRepository.findByPetId(petId)).thenReturn(expectedVisits);

        List<Visit> actualVisits = visitService.findByPetId(petId);

        assertEquals(expectedVisits, actualVisits);
        assertEquals(2, actualVisits.size());
        actualVisits.forEach(result -> assertEquals(petId, result.getPetId()));
        verify(visitRepository).findByPetId(petId);
    }

    @Test
    void testFindByVetId() {
        Integer vetId = 2;
        List<Visit> expectedVisits = List.of(
                visit(1, 7, vetId, "rabies shot"),
                visit(2, 8, vetId, "rabies shot")
        );
        when(visitRepository.findByVetId(vetId)).thenReturn(expectedVisits);

        List<Visit> actualVisits = visitService.findByVetId(vetId);

        assertEquals(expectedVisits, actualVisits);
        assertEquals(2, actualVisits.size());
        actualVisits.forEach(result -> assertEquals(vetId, result.getVetId()));
        verify(visitRepository).findByVetId(vetId);
    }

    @Test
    void testDeleteVisit() {
        Integer visitId = 5;

        visitService.delete(visitId);

        verify(visitRepository).deleteById(visitId);
    }

    private Visit visit(Integer id, Integer petId, Integer vetId, String description) {
        return new Visit(id, petId, vetId, LocalDate.of(2024, 1, 15), description,
                new BigDecimal("45.00"));
    }
}
