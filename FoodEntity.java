package com.fita.food.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Food_Entity")
public class FoodEntity {
	@Id
	@GeneratedValue
@Column(name="user_id")	
private int userid;
@Column(name="user_name")	
private String username;
@Column(name="password")
private String password;
@Column(name="confirmpassword")
private String confirmpassword;
@Column(name="mobile_no")
private int mobileno;
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getConfirmpassword() {
	return confirmpassword;
}
public void setConfirmpassword(String confirmpassword) {
	this.confirmpassword = confirmpassword;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
@Override
public String toString() {
	return "FoodEntity [userid=" + userid + ", username=" + username + ", password=" + password + ", confirmpassword="
			+ confirmpassword + ", mobileno=" + mobileno + "]";
}
public FoodEntity(int userid, String username, String password, String confirmpassword, int mobileno) {
	super();
	this.userid = userid;
	this.username = username;
	this.password = password;
	this.confirmpassword = confirmpassword;
	this.mobileno = mobileno;
}
public FoodEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public FoodEntity get() {
	// TODO Auto-generated method stub
	return null;
}

}
