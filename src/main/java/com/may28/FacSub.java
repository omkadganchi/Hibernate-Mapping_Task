package com.may28;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FacSub {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int subId;
	String subName;

	public FacSub(int subId, String subName) {
		super();
		this.subId = subId;
		this.subName = subName;
	}

	public FacSub(String subName) {
		super();
		this.subName = subName;
	}

	public FacSub() {
		super();
	}

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	@Override
	public String toString() {
		return "FacSub [subId=" + subId + ", subName=" + subName + "]";
	}
}
