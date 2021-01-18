package com.motivity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CQ")
public class Cheque extends Payment{
	
	@Column(name = "cheque_type")
	private String cheque_type;

	public String getCheque_type() {
		return cheque_type;
	}

	public void setCheque_type(String cheque_type) {
		this.cheque_type = cheque_type;
	}
	
}
