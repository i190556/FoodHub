package application;

public class Customer {

	private String Contact;
	private String Name;
	private String Address;
	private String Email;
	
	private String ID;
	private String Password;

	private Cart cart;
	private Order order;
	

	public Customer() {
		setContact("");
		setName("");
		setAddress("");
		setEmail("");
		
		setID("");
		setPassword("");
	}

	public Customer(String cont, String nam, String add, String emai, String id, String pass) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
		
		setID(id);
		setPassword(pass);
	}

	public void UpdateProfile(String cont, String nam, String add, String emai) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
	}

	public void CreateProfile(String cont, String nam, String add, String emai, String id, String pass) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
		
		setID(id);
		setPassword(pass);
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	//---------------------------------CART CLASS---------------------------------//
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	public void Set_Cart(String it, int pri) {
		cart.setItem(it);
		cart.setPrice(pri);
	}
	
	public String Cart_getItem() {
		return cart.getItem();
	}
	public void Cart_setItem(String item) {
		cart.setItem(item);
	}
	public int Cart_getPrice() {
		return cart.getPrice();
	}
	public void Cart_setPrice(int price) {
		cart.setPrice(price);
	}
	public int Cart_getTotalprice() {
		return cart.getTotalprice();
	}
	public void Cart_setTotalprice(int totalprice) {
		cart.setTotalprice(totalprice);
	}
	
	//---------------------------------ORDER CLASS---------------------------------//

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public void Order_Set_OrderItem(String it, int pri, int id) {
		order.Set_OrderItem(it, pri, id);
	}
	
	public String Order_getItem() {
		return order.getItem();
	}
	public void Order_setItem(String item) {
		order.setItem(item);
	}
	public int Order_getPrice() {
		return order.getPrice();
	}
	public void Order_setPrice(int price) {
		order.setPrice(price);
	}
	public int Order_getTotalprice() {
		return order.getTotalprice();
	}
	public void Order_setTotalprice(int totalprice) {
		order.setTotalprice(totalprice);
	}
	public int Order_getCus_id() {
		return order.getCus_id();
	}
	public void Order_setCus_id(int cus_id) {
		order.setCus_id(cus_id);
	}
}