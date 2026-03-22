package com.smartrestaurant.reservation.mapper;

import com.smartrestaurant.reservation.domain.RestaurantTable;
import com.smartrestaurant.reservation.domain.TableFeature;
import com.smartrestaurant.reservation.dto.RestaurantTableResponse;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class RestaurantTableMapper {

    public RestaurantTableResponse toResponse(RestaurantTable restaurantTable) {
        RestaurantTableResponse response = new RestaurantTableResponse();
        response.setId(restaurantTable.getId());
        response.setTableNumber(restaurantTable.getTableNumber());
        response.setCapacity(restaurantTable.getCapacity());
        response.setXPosition(restaurantTable.getXPosition());
        response.setYPosition(restaurantTable.getYPosition());
        response.setActive(restaurantTable.isActive());
        response.setFeatures(
            restaurantTable.getFeatures().stream()
                .map(TableFeature::getCode)
                .sorted(Comparator.comparing(featureCode -> featureCode.name()))
                .toList()
        );
        return response;
    }

    public List<RestaurantTableResponse> toResponseList(Collection<RestaurantTable> restaurantTables) {
        return restaurantTables.stream()
            .map(this::toResponse)
            .toList();
    }
}
