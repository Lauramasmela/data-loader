package com.sofia.dataloader.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FestDetails {

    @JsonProperty("dept_sk")
    private int dept_sk;
    @JsonProperty("coordonnees_insee")
    private List<Float> coordonneesInsee;
    @JsonProperty("date_de_fin_ancien")
    private String dateFin;
    @JsonProperty("mois_indicatif_en_chiffre_y_compris_double_mois")
    private int moisIndicatif;
    @JsonProperty("nom_departement")
    private String nomDepartement;
    @JsonProperty("departement")
    private String codeDepartement;
    @JsonProperty("periodicite")
    private String periodicite;
    @JsonProperty("mois_habituel_de_debut")
    private String moisHabituelDebut;
    @JsonProperty("code_postal")
    private String codePostal;
    @JsonProperty("complement_domaine")
    private String complementDomaine;
    @JsonProperty("autres_communes")
    private String autresCommunes;
    @JsonProperty("domaine")
    private String domaine;
    @JsonProperty("date_debut_ancien")
    private String dateDebut;
    @JsonProperty("commune_principale")
    private String nomCommune;
    @JsonProperty("region")
    private String nomRegion;
    @JsonProperty("nom_de_la_manifestation")
    private String nomManifestation;
    @JsonProperty("ndeg_identification")
    private String ndegIdentification;
    @JsonProperty("site_web")
    private String siteWeb;
    @JsonProperty("date_de_creation")
    private String dateCreation;
    private String description;



}
