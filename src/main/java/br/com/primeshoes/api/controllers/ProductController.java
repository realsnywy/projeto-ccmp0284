package br.com.primeshoes.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.primeshoes.api.dtos.ProductDTO;
import br.com.primeshoes.api.mappers.ProductMapper;
import br.com.primeshoes.api.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public ResponseEntity<ProductDTO> createProduct(@RequestBody ProductDTO productDTO) {
        ProductDTO productResponseDTO = ProductMapper.toDTO(productService.store(productDTO));
        return new ResponseEntity<>(productResponseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable Long id) {
        ProductDTO productDTO = ProductMapper.toDTO(productService.findById(id));
        return ResponseEntity.ok(productDTO);
    }

    @GetMapping
    public List<ProductDTO> listAll() {
        return productService.getAll();
    }
}
