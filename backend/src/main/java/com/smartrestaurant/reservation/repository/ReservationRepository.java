package com.smartrestaurant.reservation.repository;

import com.smartrestaurant.reservation.domain.Reservation;
import com.smartrestaurant.reservation.domain.ReservationStatus;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    List<Reservation> findAllByRestaurantTableId(Long restaurantTableId);

    List<Reservation> findAllByStatus(ReservationStatus status);

    boolean existsByRestaurantTableIdAndStartTimeLessThanAndEndTimeGreaterThan(
        Long restaurantTableId,
        LocalDateTime endTime,
        LocalDateTime startTime
    );
}
