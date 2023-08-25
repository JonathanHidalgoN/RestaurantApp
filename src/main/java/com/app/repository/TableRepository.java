package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.model.RestaurantTable;

@Repository
public interface TableRepository extends CrudRepository<RestaurantTable, Long> {
}
