package com.restaurant_project.menu_be.Repository;

import com.restaurant_project.menu_be.Persistence.Food;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository <Food, Long> {
}
