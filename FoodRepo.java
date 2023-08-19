package com.fita.food.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fita.food.Entity.FoodEntity;
@Repository
public interface FoodRepo extends JpaRepository<FoodEntity, Integer>{
	}

