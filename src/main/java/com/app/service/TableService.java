package com.app.service;

import java.util.Optional;

import com.app.model.RestaurantTable;

public interface TableService {
    
    public Iterable<RestaurantTable> getAllTables();
    public Optional<RestaurantTable> getTableById(Long id);
    public RestaurantTable saveTable(RestaurantTable table);
    public void deleteTableById(Long id);
}
