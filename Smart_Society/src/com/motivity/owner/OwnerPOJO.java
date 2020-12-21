package com.motivity.owner;

public class OwnerPOJO {

	int flatnumber,floornumber,id;
	private String name,emailid,flattype,gender,adharnumber,mobilenumber,password,dateofjoing;
	
	public String getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(String adharnumber) {
		this.adharnumber = adharnumber;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getFlatnumber() {
		return flatnumber;
	}
	public void setFlatnumber(int flatnumber) {
		this.flatnumber = flatnumber;
	}

	public int getFloornumber() {
		return floornumber;
	}
	public void setFloornumber(int floornumber) {
		this.floornumber = floornumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getFlattype() {
		return flattype;
	}
	public void setFlattype(String flattype) {
		this.flattype = flattype;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDateofjoing() {
		return dateofjoing;
	}
	public void setDateofjoing(String dateofjoing) {
		this.dateofjoing = dateofjoing;
	}

}
