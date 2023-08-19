package com.fita.food.repo1;
	

	import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
	import org.springframework.stereotype.Repository;

import com.fita.food.Entity.FoodEntity;


	@Repository
	public interface FoodRepo1 extends JpaRepositoryImplementation<FoodEntity, Integer> {

	}

