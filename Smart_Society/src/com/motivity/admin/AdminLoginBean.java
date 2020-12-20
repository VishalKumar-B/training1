package com.motivity.admin;

public class AdminLoginBean {
	public Object adminDetails() {
		AdminPOJO ap = new AdminPOJO();
		ap.setAdmin_id(1);
		ap.setAdmin_name("admin");
		ap.setAdmin_email("admin@gmail.com");
		ap.setAdmin_password("admin");
		return ap;
	}
}
