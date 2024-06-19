package com.may28;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int cid;
	String cname;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "accid")
	Accident accid;

	public Car(int cid, String cname, Accident accid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.accid = accid;
	}

	public Car() {
		super();
	}

	public Car(String cname, Accident accid) {
		super();
		this.cname = cname;
		this.accid = accid;
	}

	public Car(String cname) {
		super();
		this.cname = cname;
	}

	
	public int getCid() {
		return cid;
	}

	
	public void setCid(int cid) {
		this.cid = cid;
	}

	
	public String getCname() {
		return cname;
	}

	
	public void setCname(String cname) {
		this.cname = cname;
	}

	
	public Accident getAccid() {
		return accid;
	}

	
	public void setAccid(Accident accid) {
		this.accid = accid;
	}
	
	
	
}
