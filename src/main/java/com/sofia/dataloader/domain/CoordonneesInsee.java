package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Entity
@Embeddable
public class CoordonneesInsee {

    @Id
    private Long id;
    private float lat;
    private float lon;

    public CoordonneesInsee() {
    }

    public CoordonneesInsee(float lat, float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public float getLat() {
        return lat;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
}
