package com.smartrestaurant.reservation.dto;

import com.smartrestaurant.reservation.domain.TableFeatureCode;
import java.util.ArrayList;
import java.util.List;

public class RestaurantTableResponse {

    private Long id;
    private String tableNumber;
    private Integer capacity;
    private Integer xPosition;
    private Integer yPosition;
    private boolean active;
    private List<TableFeatureCode> features = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getXPosition() {
        return xPosition;
    }

    public void setXPosition(Integer xPosition) {
        this.xPosition = xPosition;
    }

    public Integer getYPosition() {
        return yPosition;
    }

    public void setYPosition(Integer yPosition) {
        this.yPosition = yPosition;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public List<TableFeatureCode> getFeatures() {
        return features;
    }

    public void setFeatures(List<TableFeatureCode> features) {
        this.features = features;
    }
}
