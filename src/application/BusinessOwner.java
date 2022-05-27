package application;

public class BusinessOwner {

	private String Contact;
	private String Name;
	private String Address;
	private String Email;
	
	private int ID;
	private String Password;
	
	private Business business;
	

	public BusinessOwner() {
		setContact("");
		setName("");
		setAddress("");
		setEmail("");
		
		setID(0);
		setPassword("");
	}

	public BusinessOwner(String cont, String nam, String add, String emai, int id, String pass) {
		setContact(cont);
		setName(nam);
		setAddress(add);
		setEmail(emai);
		
		setID(id);
		setPassword(pass);
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

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}

	//---------------------------------Business CLASS---------------------------------//
	public void BusinessDetails(String cont, String nam, String add, String emai,int id) {
		business.BusinessDetails(cont, nam, add, emai,id);
	}
	
	public String Bus_getContact() {
		return business.getContact();
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
	public int getB_ID() {
		return B_ID;
	}

	public void setB_ID(int b_ID) {
		B_ID = b_ID;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	//---------------------------------MENU CLASS---------------------------------//
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	

	public void Set_MenuItem(String it, int pri) {
		menu.setItem(it);
		menu.setPrice(pri);
	}
	
	public String getItem(int index) {
		return menu.getItem(index);
	}
	public void setItem(String item) {
		menu.setItem(item);
	}
	public int getPrice(int index) {
		return menu.getPrice(index);
	}
	public void setPrice(int price) {
		menu.setPrice(price);
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