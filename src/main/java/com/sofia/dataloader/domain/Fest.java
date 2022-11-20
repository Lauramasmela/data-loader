package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Fest {
    @Id
    @Column(name = "fest_id")
    private String id;
    @Column(name = "nom_fest")
    private String nomFest;
    private String description;
    @Column(name = "site_web")
    private String siteWeb;
    @Column(name = "mois_habituel_debut")
    private int moisHabituelDebut;
    @Column(name = "date_debut")
    private LocalDate dateDebut;
    @Column(name = "date_fin")
    private LocalDateTime dateFin;
    @Column(name = "date_creation")
    private LocalDateTime dateCreation;
    private double latitude;
    private double longitude;
    @ManyToOne
    @JoinColumn(name="commune_id")
    private Commune commune;
    private String periodicite;
    @ManyToMany(mappedBy = "fests")
    private List<Categorie> categories;

}
