package com.app.model;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "restaurant_order")
public class RestaurantOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "arrive_time")
    @Temporal(TemporalType.TIMESTAMP)
    Date arriveTime;

    @Column(name = "leave_time")
    @Temporal(TemporalType.TIMESTAMP)
    Date leaveTime;
    
    @ManyToMany
    @JoinTable(
        name = "order_product",
        joinColumns = @JoinColumn(name = "order_id"),
        inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<RestaurantProduct> products;

    public RestaurantOrder() {
    }

    public RestaurantOrder(Date arriveTime, Date leaveTime) {
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
    }

    Date getArriveTime() {
        return arriveTime;
    }

    void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    Date getLeaveTime() {
        return leaveTime;
    }

    void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    @Override
    public String toString() {
        return "RestaurantOrder{" +
                "id=" + id +
                ", arriveTime=" + arriveTime +
                ", leaveTime=" + leaveTime +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RestaurantOrder) {
            RestaurantOrder restaurantOrder = (RestaurantOrder) obj;
            return restaurantOrder.getArriveTime().equals(this.getArriveTime());
        }
        return false;
    }
}
