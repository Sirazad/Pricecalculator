package net.magus.Pricecalculator.controller;

import net.magus.Pricecalculator.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    ProductTypeService service;

    @GetMapping("/")
    public String homepage() {
        String text = "<html><body>"+
                "<h1>This is the price calculator base page </h1></b> "+
                "the products are: <p/>"+
                service.getAllProductTypes().toString();
        return text;
    }
}
