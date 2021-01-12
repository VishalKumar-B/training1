package com.motivity.onetomany;

import java.util.Set;

public class VendorPOJO {

	private int vendor_id;

	private String vendor_name;

	private Set<CustomerPOJO> customer;

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_name() {
		return vendor_name;
	}

	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}

	public Set<CustomerPOJO> getCustomer() {
		return customer;
	}

	public void setCustomer(Set<CustomerPOJO> customer) {
		this.customer = customer;
	}

}
