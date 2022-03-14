package com.cg.model;

public class Customer {
	private String customerName;
	private int customerId, customerContact;
	private Address customerAddress;

	public Customer(int customerId, String customerName, int customerContact, Address customerAddress) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public Customer() {
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}

	public void displayCustomer() {
		System.out.println("Customer Name :-" + customerName);
		System.out.println("Customer Id :-" + customerId);
		System.out.println("Customer Address :-" + customerAddress);
		System.out.println("Customer Contact :-" + customerContact);

	}
}
