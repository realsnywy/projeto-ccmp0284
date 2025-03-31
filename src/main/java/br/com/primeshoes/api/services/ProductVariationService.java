package br.com.primeshoes.api.services;

import br.com.primeshoes.api.dtos.ProductVariationDTO;
import br.com.primeshoes.api.entities.ProductVariation;
import br.com.primeshoes.api.mappers.ProductVariationMapper;
import br.com.primeshoes.api.repositories.ProductVariationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductVariationService {

    @Autowired
    private ProductVariationRepository productVariationRepository;

    @Autowired
    private ProductVariationMapper productVariationMapper;

    public List<ProductVariationDTO> getVariationsByProductId(int productId) {
        return productVariationRepository.findByProductId(productId).stream().map(productVariationMapper::toDTO).collect(Collectors.toList());
    }

    public void addProductVariation(ProductVariationDTO productVariationDTO) {
        ProductVariation productVariation = productVariationMapper.toEntity(productVariationDTO);
        productVariationRepository.save(productVariation);
    }

    public void updateStock(int id, int quantity) {
        ProductVariation productVariation = productVariationRepository.findById(id).orElseThrow(() -> new RuntimeException("Product variation not found"));
        productVariation.updateStock(quantity);
        productVariationRepository.save(productVariation);
    }
}