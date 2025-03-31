package br.com.primeshoes.api.repositories;

import br.com.primeshoes.api.entities.ProductVariation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductVariationRepository extends JpaRepository<ProductVariation, Integer> {
}