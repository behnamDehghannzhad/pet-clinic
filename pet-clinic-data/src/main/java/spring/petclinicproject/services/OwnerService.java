package spring.petclinicproject.services;

import spring.petclinicproject.model.Owner;

import java.util.List;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long Id);

    List<Owner> findAll();

    void save(Owner owner);
}
