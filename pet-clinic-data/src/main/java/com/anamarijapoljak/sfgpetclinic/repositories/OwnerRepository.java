package com.anamarijapoljak.sfgpetclinic.repositories;

import com.anamarijapoljak.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long>
{

    Owner findByLastName(String lastName);
}
