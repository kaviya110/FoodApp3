package com.fita.food.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fita.food.Entity.FoodEntity;
import com.fita.food.service.FoodService;
import com.fita.food.service1.FoodService1;
@RestController
@RequestMapping("/foodapp")
public class FoodController {
	@Autowired
	FoodService fdservice;
	@Autowired
	FoodService1 fdservice1;
	@PostMapping("/food")
	public FoodEntity savedatafood(@RequestBody FoodEntity fd) {
    return fdservice.savefoodData(fd);
	}	
	@GetMapping("/get-food-record")
	public List<FoodEntity> getfoodrecord(){
		return fdservice.getallfoodrecord();
	}
	@GetMapping("/get-food-recordByuserid/{userid}")
	public String getdata(@PathVariable int userid,@RequestParam String name, @RequestParam String password) {
		FoodEntity entity= fdservice.getbyfoodid(userid);
		if (entity != null) {
			System.out.println("Retrieved Name: " + entity.getUsername());
			System.out.println("Retrieved Password: " + entity.getPassword());

			if (entity.getUsername().equals(name) && entity.getPassword().equals(password)) {
				return "success";
			} else {
				return "error(data does not match)";
			}
		} else {
			System.out.println("Entity not found for id: " + userid);
			return "error(data not found)";
		}
	}
	}


