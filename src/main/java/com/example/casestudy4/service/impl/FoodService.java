package com.example.casestudy4.service.impl;

import com.example.casestudy4.model.Food;
import com.example.casestudy4.repository.FoodRepository;
import com.example.casestudy4.service.IFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService implements IFoodService {
    @Autowired
    private FoodRepository foodRepository;
    @Override
    public Food save(Food food) {
        return foodRepository.save(food);
    }

    @Override
    public void delete(Long id) {
        foodRepository.deleteById(id);
    }

    @Override
    public Optional<Food> findById(Long id) {
        return foodRepository.findById(id);
    }

    @Override
    public List<Food> findAll() {
        return foodRepository.findAll();
    }
}
