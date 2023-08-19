package com.fita.food.Entity1;


	
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	@Entity
	public class FoodEntity1{
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE)
		private int userid;
		private String username;
		private String password;
		public int getUserid() {
			return userid;
		}
		public void setUser_id(int userid) {
			this.userid = userid;
		}
		public String getUser_name() {
			return username;
		}

		public void setUser_name(String username) {
			this.username = username;
		}
		public String getUserpassword() {
			return password;
		}

	public void setUserpassword(String password) {
			this.password = password;
		}

		public FoodEntity1(int userid, String username, String password) {
			super();
			this.userid = userid;
			this.username = username;
			this.password = password;
		}

		public FoodEntity1() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "FoodEntity1 [userid=" + userid + ", username=" + username + ", password =" + password
					+ "]";
		}

	}



