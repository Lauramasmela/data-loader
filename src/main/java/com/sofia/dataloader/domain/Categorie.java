package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Categorie {
    @Id
    @Column(name = "categorie_id")
    private String id;
    @Column(name = "nom_categorie")
    private String nomCategorie;
    @ManyToMany
    @JoinTable(name = "fest_categorie",
            joinColumns = @JoinColumn(name = "fest_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id",
                    referencedColumnName = "id"))
    private List<Fest> fests;
}
