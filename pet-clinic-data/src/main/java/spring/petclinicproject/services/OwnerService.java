package spring.petclinicproject.services;

import spring.petclinicproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
