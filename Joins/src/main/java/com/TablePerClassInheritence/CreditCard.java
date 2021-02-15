package com.TablePerClassInheritence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "creditcard")
public class CreditCard extends Payment{

	@Column(name = "card_type")
	private String card_type;

	public String getCard_type() {
		return card_type;
	}

	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}

}
