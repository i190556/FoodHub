package application;

import java.util.ArrayList;

public class FoodHub {

	private SignUp signup;

	private ArrayList<Feedback> feedback;
	private ArrayList<Customer> customer;
	private ArrayList<BusinessOwner> bus_Owner;
	private ArrayList<Business> business;
	

	public FoodHub(SignUp signup, Feedback feedback, Customer customer, BusinessOwner bus_Owner, Business business,
			Cart cart, Order order, Menu menu) {
		super();
		this.signup = signup;
		this.feedback = feedback;
		this.customer = customer;
		this.bus_Owner = bus_Owner;
		this.business = business;
		this.cart = cart;
		this.order = order;
		this.menu = menu;
	}
	public SignUp getSignup() {
		return signup;
	}
	public void setSignup(SignUp signup) {
		this.signup = signup;
	}
	public Feedback getFeedback() {
		return feedback;
	}
	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public BusinessOwner getBus_Owner() {
		return bus_Owner;
	}
	public void setBus_Owner(BusinessOwner bus_Owner) {
		this.bus_Owner = bus_Owner;
	}
	public Business getBusiness() {
		return business;
	}
	public void setBusiness(Business business) {
		this.business = business;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
}
