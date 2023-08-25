package com.app.service;

import java.util.Optional;

import com.app.model.RestaurantOrder;

public interface OrderService {
    
    public Iterable<RestaurantOrder> getAllOrders();
    public Optional<RestaurantOrder> getOrderById(Long id);
    public RestaurantOrder saveOrder(RestaurantOrder order);
    public void deleteOrderById(Long id);
}
