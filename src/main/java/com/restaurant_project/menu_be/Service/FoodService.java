package com.restaurant_project.menu_be.Service;

import com.restaurant_project.menu_be.Error.NotFoundException;
import com.restaurant_project.menu_be.Persistence.Food;
import com.restaurant_project.menu_be.Repository.FoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {
    private final FoodRepository foodRepository;

    //add Constructor
    public FoodService(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    //response all foods for customer
    public List<Food> getAllFood(){
        return foodRepository.findAll();
    }

    public Food getFoodById(Long id) {
        return foodRepository.findById(id)
                .orElseThrow(() -> new NotFoundException("Food not found"));
    }
    public Food createFood(Food food){
        return foodRepository.save(food);
    }
    public Food updateFood(Long id, Food updateFood){
        //declare existingFood
        Food existingFood = getFoodById(id);
        existingFood.setName(updateFood.getName());
        existingFood.setDescription(updateFood.getDescription());
        existingFood.setPrice(updateFood.getPrice());
        return foodRepository.save(existingFood);
    }
    public void deleteFood(Long id){
        foodRepository.deleteById(id);
    }
}
