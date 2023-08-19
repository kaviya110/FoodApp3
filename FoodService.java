package com.fita.food.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fita.food.Entity.FoodEntity;
import com.fita.food.repo.FoodRepo;
@Service
public class FoodService {
    @Autowired
    FoodRepo repo;
    public FoodEntity savefoodData(FoodEntity F) {
	  return repo.save(F);
}
    public List<FoodEntity> getallfoodrecord(){
		return repo.findAll();	
	}
    public FoodEntity getbyfoodid(int userid) {
        Optional<FoodEntity> en = repo.findById(userid);
    	if(en.isPresent()) {
    		return en.get();
    	} else {
    		return null;
    	}
    
    }

}