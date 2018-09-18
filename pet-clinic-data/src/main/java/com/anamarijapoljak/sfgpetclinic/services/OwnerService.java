package com.anamarijapoljak.sfgpetclinic.services;

import com.anamarijapoljak.sfgpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
