package spring.petclinicproject.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import spring.petclinicproject.model.Owner;
import spring.petclinicproject.model.Vet;
import spring.petclinicproject.services.map.OwnerServiceMap;
import spring.petclinicproject.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerServiceMap ownerServiceMap;
    private final VetServiceMap vetServiceMap;

    @Autowired
    public DataLoader(OwnerServiceMap ownerServiceMap, VetServiceMap vetServiceMap) {
        this.ownerServiceMap = ownerServiceMap;
        this.vetServiceMap = vetServiceMap;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerServiceMap.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Fiona");
        owner2.setLastName("Glenanne");

        ownerServiceMap.save(owner2);

        System.out.println("loaded owners ...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetServiceMap.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Simon");
        vet2.setLastName("West");

        vetServiceMap.save(vet2);

        System.out.println("loaded vets ...");
    }
}
