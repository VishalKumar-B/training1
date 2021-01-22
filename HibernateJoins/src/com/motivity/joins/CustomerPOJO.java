package com.motivity.joins;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer1")
public class CustomerPOJO {

	@Id
	@Column(name = "cid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;

	@Column(name = "cname")
	private String customer_name;

	
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
