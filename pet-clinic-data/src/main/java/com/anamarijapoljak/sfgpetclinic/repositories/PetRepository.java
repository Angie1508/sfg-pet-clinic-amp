package com.anamarijapoljak.sfgpetclinic.repositories;

import com.anamarijapoljak.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long>
{

}
