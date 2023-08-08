package com.example.spring6restmvc.controller;

import com.example.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class BeerController {
    private final BeerService beerService;
}
