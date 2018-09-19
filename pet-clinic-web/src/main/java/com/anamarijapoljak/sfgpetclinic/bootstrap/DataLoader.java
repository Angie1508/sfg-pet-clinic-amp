package com.anamarijapoljak.sfgpetclinic.bootstrap;

import com.anamarijapoljak.sfgpetclinic.model.Owner;
import com.anamarijapoljak.sfgpetclinic.model.Vet;
import com.anamarijapoljak.sfgpetclinic.services.OwnerService;
import com.anamarijapoljak.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    public final OwnerService ownerService;
    public final VetService vetService;


    // CONSTRUCTOR BASED// NO @AUTOWIRED
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstName("Marko");
        owner.setLastName("Markić");

        ownerService.save(owner);

        Owner owner2 = new Owner();
        owner2.setFirstName("Pero");
        owner2.setLastName("Perić");

        ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Matilda");
        owner3.setLastName("Kerić");

        ownerService.save(owner3);


        System.out.println("Loaded Owners");


        Vet vet = new Vet();
        vet.setFirstName("Vetko");
        vet.setLastName("Vetkić");
        vetService.save(vet);

        Vet vet2 = new Vet();
        vet2.setFirstName("Marina");
        vet2.setLastName("Marić");
        vetService.save(vet2);


        Vet vet3 = new Vet();
        vet3.setFirstName("Josip");
        vet3.setLastName("Škarić");
        vetService.save(vet3);

        System.out.println("Loaded Vets");
    }


}
