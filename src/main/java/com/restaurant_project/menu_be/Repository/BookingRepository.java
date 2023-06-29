package com.restaurant_project.menu_be.Repository;

import com.restaurant_project.menu_be.Persistence.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository <Booking, Long> {
}
