package spring.petclinicproject.services;

import spring.petclinicproject.model.Owner;
import spring.petclinicproject.model.Pet;

import java.util.List;

public interface PetService {

    Pet findById(Long Id);

    List<Pet> findAll();

    void save(Pet pet);
}
