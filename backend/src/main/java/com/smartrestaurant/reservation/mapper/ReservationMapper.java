package com.smartrestaurant.reservation.mapper;

import com.smartrestaurant.reservation.domain.Reservation;
import com.smartrestaurant.reservation.domain.RestaurantTable;
import com.smartrestaurant.reservation.dto.CreateReservationRequest;
import com.smartrestaurant.reservation.dto.ReservationResponse;
import org.springframework.stereotype.Component;

@Component
public class ReservationMapper {

    public Reservation toEntity(CreateReservationRequest request, RestaurantTable restaurantTable) {
        Reservation reservation = new Reservation();
        reservation.setRestaurantTable(restaurantTable);
        reservation.setCustomerName(request.getCustomerName());
        reservation.setCustomerEmail(request.getCustomerEmail());
        reservation.setPartySize(request.getPartySize());
        reservation.setStartTime(request.getStartTime());
        reservation.setEndTime(request.getEndTime());
        return reservation;
    }

    public ReservationResponse toResponse(Reservation reservation) {
        ReservationResponse response = new ReservationResponse();
        response.setId(reservation.getId());
        response.setTableId(reservation.getRestaurantTable().getId());
        response.setTableNumber(reservation.getRestaurantTable().getTableNumber());
        response.setCustomerName(reservation.getCustomerName());
        response.setCustomerEmail(reservation.getCustomerEmail());
        response.setPartySize(reservation.getPartySize());
        response.setStartTime(reservation.getStartTime());
        response.setEndTime(reservation.getEndTime());
        response.setStatus(reservation.getStatus());
        return response;
    }
}
