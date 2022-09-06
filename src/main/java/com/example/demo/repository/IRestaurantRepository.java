package com.example.demo.repository;

import com.example.demo.model.Foods;
import com.example.demo.model.Restaurants;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantRepository extends JpaRepository<Restaurants,Long> {
    Page<Restaurants> findAllByNameContaining(Pageable pageable, String name);
}
