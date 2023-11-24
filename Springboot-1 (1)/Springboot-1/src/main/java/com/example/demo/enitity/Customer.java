package com.example.demo.enitity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="CUSTOMER")
public class Customer {
	
	@Id
	private int CUST_ID;
	private String NAME;
	private int AGE;
	public Customer(int cUST_ID, String nAME, int aGE) {
		super();
		CUST_ID = cUST_ID;
		NAME = nAME;
		AGE = aGE;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCUST_ID() {
		return CUST_ID;
	}
	public void setCUST_ID(int cUST_ID) {
		CUST_ID = cUST_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getAGE() {
		return AGE;
	}
	public void setAGE(int aGE) {
		AGE = aGE;
	}
	
	

}
