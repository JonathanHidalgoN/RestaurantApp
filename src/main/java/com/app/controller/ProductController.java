package com.app.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.RestaurantProduct;
import com.app.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {
    
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public Iterable<RestaurantProduct> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public RestaurantProduct getProductById(Long id) {
        return productService.getProductById(id)
        .orElseThrow(
            () -> new RuntimeException("Product with id " + id + " does not exist.")
        );
    }

    @PostMapping("/addproduct")
    public RestaurantProduct saveProduct(RestaurantProduct product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProductById(Long id) {
        productService.deleteProductById(id);
    }

}
