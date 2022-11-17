package com.sofia.dataloader.domain;

import lombok.AllArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@Entity
@Embeddable
public class Geometry {

    @Id
    private Long id;
    private String type;
    private Float lat;
    private Float lon;

    public Geometry(String type, Float lat, Float lon) {
        this.type = type;
        this.lat = lat;
        this.lon = lon;
    }

    public Geometry(Float lat, Float lon) {
        this.lat = lat;
        this.lon = lon;
    }

    public Geometry() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }
}
