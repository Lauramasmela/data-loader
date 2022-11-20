package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Commune {

    @Id
    @Column(name = "commune_id")
    private String id;
    @Column(name = "nom_commune")
    private String nomCommune;
    @Column(name = "code_postal")
    private String codePostal;
    @Column(name = "code_departement")
    private String codeDepartement;
    @Column(name = "nom_departement")
    private String nomDepartement;
    @Column(name = "nom_region")
    private String nomRegion;
    @OneToMany(mappedBy = "commune")
    private List<Fest> festsList;
}
