package com.restaurant_project.menu_be.Controller;

import com.restaurant_project.menu_be.Persistence.Food;
import com.restaurant_project.menu_be.Service.FoodService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/food")
public class FoodController {
    private final FoodService foodService;

    // add foodService constructor
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping
    public List<Food> getAllFood() {
        return foodService.getAllFood();
    }
    @GetMapping("/{id}")
    public Food getFoodById(@PathVariable Long id) {
        return foodService.getFoodById(id);
    }
    @PostMapping
    public Food createFood(@RequestBody Food food) {
        return foodService.createFood(food);
    }
    @PutMapping("/{id}")
    public Food updateFood(@PathVariable Long id, @RequestBody Food updatedFood) {
        return foodService.updateFood(id, updatedFood);
    }
    @DeleteMapping("/{id}")
    public void deleteFood(@PathVariable Long id) {
        foodService.deleteFood(id);
    }

}

