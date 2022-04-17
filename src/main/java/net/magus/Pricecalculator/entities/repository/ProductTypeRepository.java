package net.magus.Pricecalculator.entities.repository;

import net.magus.Pricecalculator.entities.models.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductType, Long> {

}
