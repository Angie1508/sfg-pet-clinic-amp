package com.anamarijapoljak.sfgpetclinic.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Types")
public class PetType extends BaseEntity {


    @Column(name = "Name")
    private String name;


}
