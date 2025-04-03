package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.ProductVariationDTO;
import br.com.primeshoes.api.entities.ProductVariation;
import org.springframework.stereotype.Component;

@Component
public class ProductVariationMapper {

    public ProductVariationDTO toDTO(ProductVariation productVariation) {
        return new ProductVariationDTO(
            productVariation.getId(),
            productVariation.getProductId(),
            productVariation.getColor(),
            productVariation.getSize(),
            productVariation.getStock()
        );
    }

    public ProductVariation toEntity(ProductVariationDTO dto) {
        ProductVariation productVariation = new ProductVariation();
        productVariation.setId(dto.id());
        productVariation.setProductId(dto.productId());
        productVariation.setColor(dto.color());
        productVariation.setSize(dto.size());
        productVariation.setStock(dto.stock());
        return productVariation;
    }
}