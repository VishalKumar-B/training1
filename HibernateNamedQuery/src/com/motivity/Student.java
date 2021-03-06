package com.motivity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@NamedQueries ({
	@NamedQuery(
			name = "findbyfirstname",
			query = "from Student s where s.firstname=:name"
			),
	@NamedQuery(
			name = "findbylastname",
			query = "from Student s where s.lastname=:name"
			)
})


@Entity
@Table(name = "student3")
public class Student {

	@Id
	@PrimaryKeyJoinColumn
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


}
