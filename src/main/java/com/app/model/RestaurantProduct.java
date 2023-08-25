package com.app.model;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_product")
public class RestaurantProduct {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private double productPrice;
    
    @ManyToMany(mappedBy = "products")
    private Set<RestaurantOrder> orders = new HashSet<>();

    public RestaurantProduct() {
    }

    public RestaurantProduct(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    String getProductName() {
        return productName;
    }

    void setProductName(String productName) {
        this.productName = productName;
    }

    double getProductPrice() {
        return productPrice;
    }

    void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "RestaurantProduct{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RestaurantProduct) {
            RestaurantProduct restaurantProduct = (RestaurantProduct) obj;
            return restaurantProduct.getProductName().equals(this.getProductName());
        }
        return false;
    }

}
