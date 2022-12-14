package net.magus.Pricecalculator.controller;

import net.magus.Pricecalculator.entities.models.Cart;
import net.magus.Pricecalculator.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    ProductTypeService service;

    @GetMapping("/")
    public String homepage(Model model) {
        model.addAttribute("categories", service.getAllProductTypes());
        return "home";
    }


    @GetMapping("/index")
    public String showProductTypeList(Cart cart) {
//        model.addAttribute("cart", new Cart());
        if (cart == null) cart = new Cart();

        return "index";
    }
}
