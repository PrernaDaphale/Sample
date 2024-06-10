package com.tka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Car {
	
	@Id
	int cid;
	String company;
	@Column(name = "owner")
	String owner;
	String cost;
	

	public Car(int cid, String company, String owner, String cost) {
		super();
		this.cid = cid;
		this.company = company;
		this.owner = owner;
		this.cost = cost;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public String toString() {
		return "Car [cid=" + cid + ", company=" + company + ", owner=" + owner + ", cost=" + cost + "]";
	}
	

	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	
}
