package com.udacity.pricing.repository;

import com.udacity.pricing.entity.Price;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {

    @Query("select p.id, p.currency, p.price, p.vehicleId from Price p where p.vehicleId=:vehicleId")
    Price findPriceByVehicleId(Long vehicleId);

}
