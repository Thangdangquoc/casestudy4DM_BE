package com.example.casestudy4.repository;

import com.example.casestudy4.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,Long> {
}
