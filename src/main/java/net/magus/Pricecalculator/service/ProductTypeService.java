package net.magus.Pricecalculator.service;

import net.magus.Pricecalculator.entities.models.ProductType;
import net.magus.Pricecalculator.entities.repository.ProductTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeService {
    @Autowired
    private ProductTypeRepository repository;

    public List<ProductType> getAllProductTypes()  {
        return repository.findAll();
    }
}
