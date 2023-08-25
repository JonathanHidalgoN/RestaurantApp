package com.app.service;

import java.util.Optional;

import com.app.model.RestaurantProduct;

public interface ProductService {

    public Iterable<RestaurantProduct> getAllProducts();
    public Optional<RestaurantProduct> getProductById(Long id);
    public RestaurantProduct saveProduct(RestaurantProduct product);
    public void deleteProductById(Long id);
}
