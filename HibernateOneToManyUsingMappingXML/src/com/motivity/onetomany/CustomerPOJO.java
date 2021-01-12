package com.motivity.onetomany;

public class CustomerPOJO {
	private int customer_id;
	private String customer_name;
	private int fvid;

	public int getFvid() {
		return fvid;
	}

	public void setFvid(int fvid) {
		this.fvid = fvid;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

}
