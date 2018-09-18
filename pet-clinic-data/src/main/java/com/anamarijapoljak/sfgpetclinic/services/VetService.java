package com.anamarijapoljak.sfgpetclinic.services;

import com.anamarijapoljak.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet findById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
