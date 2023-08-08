package com.example.spring6restmvc.controller;

import com.example.spring6restmvc.model.Beer;
import com.example.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@Controller
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id){
        log.debug("Get beer by id - controller.");
        return beerService.getBeerById(id);
    }
}
