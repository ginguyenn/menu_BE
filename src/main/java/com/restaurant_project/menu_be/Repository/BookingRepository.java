package com.restaurant_project.menu_be.Repository;

import com.restaurant_project.menu_be.Model.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository <BookingEntity, Long> {

}
