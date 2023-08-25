package com.app.repository;

import com.app.model.RestaurantOrder;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface OrderRepository extends CrudRepository<RestaurantOrder, Long> {
}