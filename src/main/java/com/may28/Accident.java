package com.may28;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accident {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int accid;
	String accPlace;
	public Accident(int accid, String accPlace) {
		super();
		this.accid = accid;
		this.accPlace = accPlace;
	}
	public Accident() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accident(String accPlace) {
		super();
		this.accPlace = accPlace;
	}
	
	public int getAccid() {
		return accid;
	}
	
	public void setAccid(int accid) {
		this.accid = accid;
	}
	
	public String getAccPlace() {
		return accPlace;
	}
	
	public void setAccPlace(String accPlace) {
		this.accPlace = accPlace;
	}
	@Override
	public String toString() {
		return "Accident [accid=" + accid + ", accPlace=" + accPlace + "]";
	}
}
