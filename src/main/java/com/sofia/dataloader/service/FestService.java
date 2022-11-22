package com.sofia.dataloader.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sofia.dataloader.beans.FestBean;
import com.sofia.dataloader.converter.FestConverter;
import com.sofia.dataloader.domain.Fest;
import com.sofia.dataloader.repository.CommuneRepository;
import com.sofia.dataloader.repository.FestRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.util.List;

@AllArgsConstructor
@Service
@Slf4j
public class FestService {

    private FestRepository festRepository;
    private CommuneRepository communeRepository;
    private FestConverter festConverter;
    private ObjectMapper objectMapper;

    public void saveDataset() throws IOException {

        List<FestBean> festList = objectMapper.readValue(new File("src/main/resources/json/panorama-des-festivals.json"), new TypeReference<List<FestBean>>() {
        });
        log.info("Début d'enregistrement");

        var compteur = 0;

        for (FestBean festBean : festList) {
            var fest = festConverter.extractFestEntity(festBean);
            var commune = festConverter.extractCommuneEntity(festBean);
            var communeFromDB = communeRepository.findFirstByNomCommuneAndCodePostal(commune.getNomCommune(), commune.getCodePostal());

            if (communeFromDB.isEmpty()) {
                commune = communeRepository.save(commune);
            } else {
                commune = communeFromDB.get();
            }

            fest.setCommune(commune);
            festRepository.save(fest);
            compteur++;

        }
        log.info("Fin d'enregistrement avec {} enregistrements.", compteur);
    }

}
