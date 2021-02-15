package com.JoinedInheritence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "cheque")
@PrimaryKeyJoinColumn(name = "cqid")
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
