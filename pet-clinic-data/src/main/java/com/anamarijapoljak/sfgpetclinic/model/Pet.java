package com.anamarijapoljak.sfgpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Pets")
public class Pet extends BaseEntity {

    @Column(name = "Name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "")
    private PetType petType;


    @JoinColumn(name = "owner_id")
    private Owner owner;

    @Column(name = "Birth Date")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    private Set<Visit> visits = new HashSet<>();


}
