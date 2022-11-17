package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@Entity
public class Fest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private CoordonneesInsee coordonnees_insee;

    private LocalDate date_de_fin_ancien;
    private int mois_indicatif_en_chiffre_y_compris_double_mois;
    private String nom_departement;
    private String departement;
    private String periodicite;
    private String mois_habituel_de_debut;
    private String code_postal;
    private String complement_domaine;
    private String autres_communes;
    private String libelle_commune_pour_calcul_cp_insee;
    private String domaine;
    private String date_debut_ancien;
    private String code_insee;
    private String commune_principale;
    private String region;

    @Column(nullable = false)
    private String nom_de_la_manifestation;
    private String ndeg_identification;

    private String site_web;
    private String date_de_creation;
    private int check_edition;
    private int ndeg_de_l_edition_2019;

    @Embedded
    private Geometry geometry;

    public Fest(CoordonneesInsee coordonnees_insee,
                LocalDate date_de_fin_ancien,
                int mois_indicatif_en_chiffre_y_compris_double_mois,
                String nom_departement, String departement,
                String periodicite,
                String mois_habituel_de_debut,
                String code_postal, String complement_domaine,
                String autres_communes,
                String libelle_commune_pour_calcul_cp_insee,
                String domaine, String date_debut_ancien,
                String code_insee, String commune_principale,
                String region, String nom_de_la_manifestation,
                String ndeg_identification,
                String site_web,
                String date_de_creation,
                int check_edition,
                int ndeg_de_l_edition_2019,
                Geometry geometry) {
        this.coordonnees_insee = coordonnees_insee;
        this.date_de_fin_ancien = date_de_fin_ancien;
        this.mois_indicatif_en_chiffre_y_compris_double_mois = mois_indicatif_en_chiffre_y_compris_double_mois;
        this.nom_departement = nom_departement;
        this.departement = departement;
        this.periodicite = periodicite;
        this.mois_habituel_de_debut = mois_habituel_de_debut;
        this.code_postal = code_postal;
        this.complement_domaine = complement_domaine;
        this.autres_communes = autres_communes;
        this.libelle_commune_pour_calcul_cp_insee = libelle_commune_pour_calcul_cp_insee;
        this.domaine = domaine;
        this.date_debut_ancien = date_debut_ancien;
        this.code_insee = code_insee;
        this.commune_principale = commune_principale;
        this.region = region;
        this.nom_de_la_manifestation = nom_de_la_manifestation;
        this.ndeg_identification = ndeg_identification;
        this.site_web = site_web;
        this.date_de_creation = date_de_creation;
        this.check_edition = check_edition;
        this.ndeg_de_l_edition_2019 = ndeg_de_l_edition_2019;
        this.geometry = geometry;
    }

    public Fest() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CoordonneesInsee getCoordonnees_insee() {
        return coordonnees_insee;
    }

    public void setCoordonnees_insee(CoordonneesInsee coordonnees_insee) {
        this.coordonnees_insee = coordonnees_insee;
    }

    public LocalDate getDate_de_fin_ancien() {
        return date_de_fin_ancien;
    }

    public void setDate_de_fin_ancien(LocalDate date_de_fin_ancien) {
        this.date_de_fin_ancien = date_de_fin_ancien;
    }

    public int getMois_indicatif_en_chiffre_y_compris_double_mois() {
        return mois_indicatif_en_chiffre_y_compris_double_mois;
    }

    public void setMois_indicatif_en_chiffre_y_compris_double_mois(int mois_indicatif_en_chiffre_y_compris_double_mois) {
        this.mois_indicatif_en_chiffre_y_compris_double_mois = mois_indicatif_en_chiffre_y_compris_double_mois;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public String getMois_habituel_de_debut() {
        return mois_habituel_de_debut;
    }

    public void setMois_habituel_de_debut(String mois_habituel_de_debut) {
        this.mois_habituel_de_debut = mois_habituel_de_debut;
    }

    public String getCode_postal() {
        return code_postal;
    }

    public void setCode_postal(String code_postal) {
        this.code_postal = code_postal;
    }

    public String getComplement_domaine() {
        return complement_domaine;
    }

    public void setComplement_domaine(String complement_domaine) {
        this.complement_domaine = complement_domaine;
    }

    public String getAutres_communes() {
        return autres_communes;
    }

    public void setAutres_communes(String autres_communes) {
        this.autres_communes = autres_communes;
    }

    public String getLibelle_commune_pour_calcul_cp_insee() {
        return libelle_commune_pour_calcul_cp_insee;
    }

    public void setLibelle_commune_pour_calcul_cp_insee(String libelle_commune_pour_calcul_cp_insee) {
        this.libelle_commune_pour_calcul_cp_insee = libelle_commune_pour_calcul_cp_insee;
    }

    public String getDomaine() {
        return domaine;
    }

    public void setDomaine(String domaine) {
        this.domaine = domaine;
    }

    public String getDate_debut_ancien() {
        return date_debut_ancien;
    }

    public void setDate_debut_ancien(String date_debut_ancien) {
        this.date_debut_ancien = date_debut_ancien;
    }

    public String getCode_insee() {
        return code_insee;
    }

    public void setCode_insee(String code_insee) {
        this.code_insee = code_insee;
    }

    public String getCommune_principale() {
        return commune_principale;
    }

    public void setCommune_principale(String commune_principale) {
        this.commune_principale = commune_principale;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNom_de_la_manifestation() {
        return nom_de_la_manifestation;
    }

    public void setNom_de_la_manifestation(String nom_de_la_manifestation) {
        this.nom_de_la_manifestation = nom_de_la_manifestation;
    }

    public String getNdeg_identification() {
        return ndeg_identification;
    }

    public void setNdeg_identification(String ndeg_identification) {
        this.ndeg_identification = ndeg_identification;
    }

    public String getSite_web() {
        return site_web;
    }

    public void setSite_web(String site_web) {
        this.site_web = site_web;
    }

    public String getDate_de_creation() {
        return date_de_creation;
    }

    public void setDate_de_creation(String date_de_creation) {
        this.date_de_creation = date_de_creation;
    }

    public int getCheck_edition() {
        return check_edition;
    }

    public void setCheck_edition(int check_edition) {
        this.check_edition = check_edition;
    }

    public int getNdeg_de_l_edition_2019() {
        return ndeg_de_l_edition_2019;
    }

    public void setNdeg_de_l_edition_2019(int ndeg_de_l_edition_2019) {
        this.ndeg_de_l_edition_2019 = ndeg_de_l_edition_2019;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
