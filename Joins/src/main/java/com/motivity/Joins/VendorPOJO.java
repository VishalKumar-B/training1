package com.motivity.Joins;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "vendor")
public class VendorPOJO {

	@Id
	@Column(name = "vid")
	private int vendor_id;

	@Column(name = "vname")
	private String vendor_name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "vid", name = "fvid")
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
//@JoinColumn(referencedColumnName = "vid", name = "fvid")
	/*
	 * @OneToMany( cascade = CascadeType.ALL, orphanRemoval = true )
	 */