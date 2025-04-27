package com.example.MiniShop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/products")
public class ProductsController {

    @GetMapping
    public String product(Model model) {
        List<Product> products = Arrays.asList(
            new Product("000139123783", "Milk", new BigDecimal("3.10"), 100),
            new Product("089712301231", "Water", new BigDecimal("2.19"), 67),
            new Product("123082737111", "Juice", new BigDecimal("5.99"), 2)
        );

        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping
    public String processProduct(Product product) {
        log.info("Processing MiniShop project: " + product);
        return "redirect:/products";
    }

}
