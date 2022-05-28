package application;

import java.util.ArrayList;

public class FoodHub {

	private ArrayList<Feedback> feedback;
	private ArrayList<Customer> customer;
	private ArrayList<BusinessOwner> bus_Owner;
	private ArrayList<Business> business;
	

	public FoodHub() {
		feedback = new ArrayList<Feedback>();
		customer = new ArrayList<Customer>();
		bus_Owner = new ArrayList<BusinessOwner>();
		bus_Owner = new ArrayList<BusinessOwner>();
	}
  
	public FoodHub(Feedback feed, Customer cust, BusinessOwner bus_O, Business bus) {
		feedback.add(feed);
		customer.add(cust);
		bus_Owner.add(bus_O);
		business.add(bus);
	}
	public ArrayList<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(ArrayList<Feedback> feedback) {
		this.feedback = feedback;
	}
	public ArrayList<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}
	public ArrayList<BusinessOwner> getBus_Owner() {
		return bus_Owner;
	}
	public void setBus_Owner(ArrayList<BusinessOwner> bus_Owner) {
		this.bus_Owner = bus_Owner;
	}	
	public ArrayList<Business> getBusiness() {
		return business;
	}
	public void setBusiness(ArrayList<Business> business) {
		this.business = business;
	}
	//-------------------------------------CLASSES---------------------------------------------------//
	
	//=====================================FEEDBACK===================================================//


	public void StoreFeedback(Feedback feed) {
		feedback.add(feed);
	}
	public Feedback getFeedback(int index) {
		return feedback.get(index);
	}
	public void setFeedback(int index, Feedback feed) {
		feedback.set(index, feed);
	}
	//=====================================CUSTOMER===================================================//
	public void Cust_CreateProfile(Customer cust) {
		customer.add(cust);
	}
	public Customer getCustomer(int index) {
		return customer.get(index);
	}
	public void setCustomer(int index, Customer cust) {
		customer.set(index, cust);
	}
	//=====================================Business OWner===================================================//
	public void Bus_CreateProfile(BusinessOwner bus_O) {
		bus_Owner.add(bus_O);
	}
	public BusinessOwner getBusiness_Owner(int index) {
		return bus_Owner.get(index);
	}
	public void setBusiness_Owner(int index, BusinessOwner bus_O) {
		bus_Owner.set(index, bus_O);
	}
	//=====================================Business===================================================//
	public void BusinessDetails(Business bus) {
		business.add(bus);
	}
	public Business getBusiness(int index) {
		return business.get(index);
	}
	public void setBusiness(int index, Business bus) {
		business.set(index, bus);
	}
}
