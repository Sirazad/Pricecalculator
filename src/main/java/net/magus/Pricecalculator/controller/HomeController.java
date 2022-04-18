package net.magus.Pricecalculator.controller;

import net.magus.Pricecalculator.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
    @Autowired
    ProductTypeService service;

    @GetMapping("/")
    public String homepage() {
        return "home";
    }

    @GetMapping("/index")
    public String showProductTypeList(Model model) {
        model.addAttribute("categories", service.getAllProductTypes());
        return "index";
    }
}
