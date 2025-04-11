package br.com.primeshoes.api.controllers;

import br.com.primeshoes.api.dtos.ProductVariationDTO;
import br.com.primeshoes.api.services.ProductVariationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product-variations")
public class ProductVariationController {

    @Autowired
    private ProductVariationService productVariationService;

    @GetMapping("/{productId}")
    public List<ProductVariationDTO> getVariationsByProductId(@PathVariable int productId) {
        return productVariationService.getVariationsByProductId(productId);
    }

    @PostMapping
    public void addProductVariation(@RequestBody ProductVariationDTO productVariationDTO) {
        productVariationService.addProductVariation(productVariationDTO);
    }

    @PutMapping("/{id}/stock")
    public void updateStock(@PathVariable int id, @RequestParam int quantity) {
        productVariationService.updateStock(id, quantity);
    }
}