package com.example.spring6restmvc.services;

import com.example.spring6restmvc.model.Beer;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public interface BeerService {

    Beer getBeerById(UUID id);
}

