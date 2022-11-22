package com.sofia.dataloader.converter;

import com.sofia.dataloader.beans.FestBean;
import com.sofia.dataloader.domain.Commune;
import com.sofia.dataloader.domain.Fest;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.UUID;

@Component
public class FestConverter {

    public Fest extractFestEntity(FestBean festBean){

        return Fest.builder()
                .id(festBean.getRecordId())
                .dateCreation(festBean.getFestDetails().getDateCreation() != null ? LocalDate.parse(festBean.getFestDetails().getDateCreation()) : null )
                .dateDebut(festBean.getFestDetails().getDateDebut() != null ? LocalDate.parse(festBean.getFestDetails().getDateDebut()) : null)
                .dateFin(festBean.getFestDetails().getDateFin() != null ? LocalDate.parse(festBean.getFestDetails().getDateFin()) : null )
                .description(null)
                .latitude(festBean.getGeometry() != null ? festBean.getGeometry().getCoordinates()[1] : 0)
                .longitude(festBean.getGeometry() != null ? festBean.getGeometry().getCoordinates()[0] : 0)
                .moisHabituelDebut(festBean.getFestDetails().getMoisHabituelDebut())
                .nomFest(festBean.getFestDetails().getNomManifestation())
                .periodicite(festBean.getFestDetails().getPeriodicite())
                .siteWeb(festBean.getFestDetails().getSiteWeb())
                .build();
    }

    public Commune extractCommuneEntity(FestBean festBean){
        return Commune.builder()
                .id(UUID.randomUUID().toString())
                .codeDepartement(festBean.getFestDetails().getCodeDepartement())
                .codePostal(festBean.getFestDetails().getCodePostal())
                .nomCommune(festBean.getFestDetails().getNomCommune())
                .nomDepartement(festBean.getFestDetails().getNomDepartement())
                .nomRegion(festBean.getFestDetails().getNomRegion())
                .build();
    }


}
