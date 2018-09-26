package com.anamarijapoljak.sfgpetclinic.bootstrap;


import com.anamarijapoljak.sfgpetclinic.model.*;
import com.anamarijapoljak.sfgpetclinic.services.OwnerService;
import com.anamarijapoljak.sfgpetclinic.services.PetTypeService;
import com.anamarijapoljak.sfgpetclinic.services.SpecialityService;
import com.anamarijapoljak.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    // CONSTRUCTOR BASED// NO @AUTOWIRED
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }


    @Override
    public void run(String... args) throws Exception {

        int count= petTypeService.findAll().size();

        if (count==0){
        loadData();
    }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner = new Owner();
        owner.setFirstName("Marko");
        owner.setLastName("Markić");
        owner.setCity("Split");
        owner.setAddress("Mažuranicevo šetalište 12");
        owner.setTelephone("091 487 5577");
        ownerService.save(owner);



        Pet markovPet= new Pet();
        markovPet.setPetType(dog);
        markovPet.setName("Brego");
        markovPet.setOwner(owner);
        markovPet.setBirthDate(LocalDate.ofYearDay(2015,112));
        owner.getPets().add(markovPet);


        Owner owner2 = new Owner();
        owner2.setFirstName("Pero");
        owner2.setLastName("Perić");
        owner2.setCity("Split");
        owner2.setAddress("Ulica Domovinskog rata 22");
        owner2.setTelephone("021 345 678");
        ownerService.save(owner2);

        Pet pepinPet= new Pet();
        pepinPet.setPetType(cat);
        pepinPet.setName("Mila");
        pepinPet.setOwner(owner2);
        pepinPet.setBirthDate(LocalDate.ofYearDay(2011,97));
        owner2.getPets().add(pepinPet);


        Owner owner3 = new Owner();
        owner3.setFirstName("Matilda");
        owner3.setLastName("Kerić");
        owner3.setCity("Split");
        owner3.setAddress("Tršćanska 21");
        owner3.setTelephone("021 345 567");
        ownerService.save(owner3);

        Pet matildaPet= new Pet();
        matildaPet.setPetType(dog);
        matildaPet.setName("Kaja");
        matildaPet.setOwner(owner3);
        matildaPet.setBirthDate(LocalDate.ofYearDay(2008,97));
        owner3.getPets().add(matildaPet);

        System.out.println("Loaded Owners");

        Speciality radiology= new Speciality();
        radiology.setDescription("Radiology");
        Speciality savedRadiology= specialityService.save(radiology);


        Speciality surgery= new Speciality();
        radiology.setDescription("Surgery");
        Speciality savedSurgery= specialityService.save(surgery);


        Speciality dentistry= new Speciality();
        radiology.setDescription("Dentistry");
        Speciality savedDentistry= specialityService.save(dentistry);

        Vet vet = new Vet();
        vet.setFirstName("Vetko");
        vet.setLastName("Vetkić");
        vet.getSpecialities().add(savedRadiology);
        vetService.save(vet);


        Vet vet2 = new Vet();
        vet2.setFirstName("Marina");
        vet2.setLastName("Marić");
        vet2.getSpecialities().add(savedSurgery);
        vetService.save(vet2);


        Vet vet3 = new Vet();
        vet3.setFirstName("Josip");
        vet3.setLastName("Škarić");
        vet3.getSpecialities().add(savedDentistry);
        vetService.save(vet3);


        System.out.println("Loaded Vets");
    }


}
