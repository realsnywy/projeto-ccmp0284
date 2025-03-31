package br.com.primeshoes.api.mappers;

import br.com.primeshoes.api.dtos.ProductVariationDTO;
import br.com.primeshoes.api.entities.ProductVariation;
import org.springframework.stereotype.Component;

@Component
public class ProductVariationMapper {

    public ProductVariationDTO toDTO(ProductVariation productVariation) {
        ProductVariationDTO dto = new ProductVariationDTO();
        dto.id = productVariation.getId();
        dto.productId = productVariation.getProductId();
        dto.color = productVariation.getColor();
        dto.size = productVariation.getSize();
        dto.stock = productVariation.getStock();
        return dto;
    }

    public ProductVariation toEntity(ProductVariationDTO dto) {
        ProductVariation productVariation = new ProductVariation();
        productVariation.setId(dto.id);
        productVariation.setProductId(dto.productId);
        productVariation.setColor(dto.color);
        productVariation.setSize(dto.size);
        productVariation.setStock(dto.stock);
        return productVariation;
    }
}