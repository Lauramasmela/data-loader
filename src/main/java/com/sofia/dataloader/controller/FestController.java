package com.sofia.dataloader.controller;

import com.sofia.dataloader.domain.Fest;
import com.sofia.dataloader.service.FestService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")

public class FestController {
    private FestService festService;


    public FestController(FestService festService) {
        this.festService = festService;
    }

    @GetMapping(path = "/list")
    public Iterable<Fest> festList(){
        return festService.list();
    }
}
