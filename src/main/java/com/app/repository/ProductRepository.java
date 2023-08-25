package com.app.repository;

import com.app.model.RestaurantProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<RestaurantProduct , Long> {
    
}
