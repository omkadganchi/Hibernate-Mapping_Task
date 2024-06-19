package com.may28;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int facId;
	String facName;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "facId")
	List<FacSub> al;

	public Faculty(int facId, String facName, List<FacSub> al) {
		super();
		this.facId = facId;
		this.facName = facName;
		this.al = al;
	}

	public Faculty(String facName) {
		super();
		this.facName = facName;
	}

	public Faculty(String facName, List<FacSub> al) {
		super();
		this.facName = facName;
		this.al = al;
	}

	public Faculty() {
		super();
	}

	public int getFacId() {
		return facId;
	}

	public void setFacId(int facId) {
		this.facId = facId;
	}

	public String getFacName() {
		return facName;
	}

	public void setFacName(String facName) {
		this.facName = facName;
	}

	public List<FacSub> getAl() {
		return al;
	}

	public void setAl(List<FacSub> al) {
		this.al = al;
	}

	@Override
	public String toString() {
		return "Faculty [facId=" + facId + ", facName=" + facName + ", al=" + al + "]";
	}
}
