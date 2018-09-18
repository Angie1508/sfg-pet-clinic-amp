package com.anamarijapoljak.sfgpetclinic.services;

import com.anamarijapoljak.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);


}
