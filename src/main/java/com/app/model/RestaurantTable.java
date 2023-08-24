package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "table")
public class RestaurantTable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "table_identification")
    private String tableIdentification;

    @Column(name = "people_number")
    private int peopleNumber;

    public RestaurantTable() {
    }

    public RestaurantTable(String tableIdentification, int peopleNumber) {
        this.tableIdentification = tableIdentification;
        this.peopleNumber = peopleNumber;
    }

    String getTableIdentification() {
        return tableIdentification;
    }

    void setTableIdentification(String tableIdentification) {
        this.tableIdentification = tableIdentification;
    }

    int getPeopleNumber() {
        return peopleNumber;
    }

    void setPeopleNumber(int peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    @Override
    public String toString() {
        return "RestaurantTable{" +
                "id=" + id +
                ", tableIdentification='" + tableIdentification + '\'' +
                ", peopleNumber=" + peopleNumber +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof RestaurantTable) {
            RestaurantTable restaurantTable = (RestaurantTable) obj;
            return restaurantTable.getTableIdentification().equals(this.getTableIdentification());
        }
        return false;
    }

}

