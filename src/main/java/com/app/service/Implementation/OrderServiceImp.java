package com.app.service.Implementation;

import java.util.NoSuchElementException;
import java.util.Optional;

import com.app.model.RestaurantOrder;
import com.app.repository.OrderRepository;
import com.app.service.OrderService;

public class OrderServiceImp implements OrderService {
    
    private final OrderRepository orderRepository;
    
    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Iterable<RestaurantOrder> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<RestaurantOrder> getOrderById(Long id) {
        return orderRepository.findById(id);
    }

    public RestaurantOrder saveOrder(RestaurantOrder order) {
        return orderRepository.save(order);
    }

    public void deleteOrderById(Long id) {
        Optional<RestaurantOrder> order = orderRepository.findById(id);
        if (order.isPresent()) {
                orderRepository.deleteById(id);
            }
        else {
            throw new NoSuchElementException("Order with id " + id + " does not exist.");
        }
    }
}
