package com.smartrestaurant.reservation.repository;

import com.smartrestaurant.reservation.domain.RestaurantTable;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable, Long> {

    @EntityGraph(attributePaths = "features")
    Optional<RestaurantTable> findByTableNumber(String tableNumber);
}
