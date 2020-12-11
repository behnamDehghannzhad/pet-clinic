package spring.petclinicproject.services;

import spring.petclinicproject.model.Vet;

import java.util.List;

public interface VetService {

    Vet findById(Long Id);

    List<Vet> findAll();

    void save(Vet vet);
}
