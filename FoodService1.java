package com.fita.food.service1;
	import java.util.Optional;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.fita.food.Entity.FoodEntity;
import com.fita.food.repo.FoodRepo;
	@Service
	public class FoodService1 {
		@Autowired
		FoodRepo repo;
		public FoodEntity getbyfoodid(int userid) {
			Optional<FoodEntity> en = FoodRepo.findById(userid);
			if (en.isPresent()) {
				return en.get();
			} else {
				return null;
			}
		}
	}
