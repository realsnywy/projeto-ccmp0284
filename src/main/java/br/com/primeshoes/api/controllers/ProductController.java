package br.com.primeshoes.api.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.primeshoes.api.entites.Product;
import br.com.primeshoes.api.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    ProductService productService;

    /*
     * public List<Product> list(int id) {
     * System.out.println(id);
     * List<Product> products = productService.getAll();
     * return products;
     * }
     */

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return new ResponseEntity<>(productService.store(product), HttpStatus.CREATED);
    }

    /* workbench (MANO, SEI LÁ COMO USAR O MYSQL KKKKKK) */

    /*
     * @PostMapping
     * public Product createProduct(@RequestBody Product product) {
     * return productService.store(product);
     * }
     */

    @GetMapping
    public List<Product> listAll() {
        return productService.getAll();
    }
}
