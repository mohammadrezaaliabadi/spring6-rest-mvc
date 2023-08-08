package com.example.spring6restmvc.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Beer {

    private UUID id;
    private Integer version;
    private String beerName;
    private String beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
