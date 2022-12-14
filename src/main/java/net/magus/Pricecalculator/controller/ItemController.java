package net.magus.Pricecalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
    public static final String REQUEST_MAPPING = "/addItem";

    @GetMapping(REQUEST_MAPPING)
    public String getCategoryList() {
        return "forward:/home";
    }
}
