package br.com.primeshoes.api.repositories;

import br.com.primeshoes.api.entities.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer> {
    List<ProductVariation> findByProductId(int productId);
}