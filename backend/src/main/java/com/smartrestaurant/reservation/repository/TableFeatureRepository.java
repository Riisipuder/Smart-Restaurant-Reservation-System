package com.smartrestaurant.reservation.repository;

import com.smartrestaurant.reservation.domain.TableFeature;
import com.smartrestaurant.reservation.domain.TableFeatureCode;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableFeatureRepository extends JpaRepository<TableFeature, Long> {

    Optional<TableFeature> findByCode(TableFeatureCode code);
}
