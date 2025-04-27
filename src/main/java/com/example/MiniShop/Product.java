package com.example.MiniShop;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Data
@RequiredArgsConstructor
public class Product {

    private final String ean;
    private final String name;
    private final BigDecimal price;
    private final Integer stock;

}
