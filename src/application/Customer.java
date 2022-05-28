package application;

public class Customer {

	private String Contact;
	private String Name;
	private String Address;
	private String Email;
	
	private int ID;
	private String Password;

	private Cart cart;
	private Order order;
	

	public Customer() {
		setContact("");
		setName("");
		setAddress("");
		setEmail("");
		
		setID(0);
		setPassword("");
	}

	public Customer(String cont, String nam, String add, String emai, int id, String pass) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
		
		setID(id);
		setPassword(pass);
	}

	public Customer(String cont, String nam, String add, String emai, int id, String pass, Cart car, Order ord) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
		
		setID(id);
		setPassword(pass);
		
		cart = car;
		order = ord;
	}
	
	public void CreateProfile(String cont, String nam, String add, String emai, int id, String pass) {
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

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
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
		cart.Set_Cart(it, pri);
	}
	
	public String Cart_getItem(int index) {
		return cart.getItem(index);
	}
	public void Cart_setItem(String item) {
		cart.setItem(item);
	}
	public int Cart_getPrice(int index) {
		return cart.getPrice(index);
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
	
	public String Order_getItem(int index) {
		return order.getItem(index);
	}
	public void Order_setItem(String item) {
		order.setItem(item);
	}
	public int Order_getPrice(int index) {
		return order.getPrice(index);
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