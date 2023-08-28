package com.app.service.Implementation;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.app.model.RestaurantProduct;
import com.app.repository.ProductRepository;
import com.app.service.ProductService;

@Service
public class ProductServiceImp implements ProductService {
    
    private final ProductRepository productRepository;

    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<RestaurantProduct> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<RestaurantProduct> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public RestaurantProduct saveProduct(RestaurantProduct product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        Optional<RestaurantProduct> product = productRepository.findById(id);
        if (product.isPresent()) {
                productRepository.deleteById(id);
            }
        else {
            throw new NoSuchElementException("Product with id " + id + " does not exist.");
        }
    }
}
