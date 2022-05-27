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

	public void Bus_setContact(String contact) {
		business.setContact(contact);
	}

	public String Bus_getName() {
		return business.getName();
	}

	public void Bus_setName(String name) {
		business.setName(name);
	}

	public String Bus_getAddress() {
		return business.getAddress();
	}

	public void Bus_setAddress(String address) {
		business.setAddress(address);
	}

	public String Bus_getEmail() {
		return business.getEmail();
	}

	public void Bus_setEmail(String email) {
		business.setEmail(email);
	}
	public int Bus_getB_ID() {
		return business.getB_ID();
	}

	public void Bus_setB_ID(int b_ID) {
		business.setB_ID(b_ID);
	}

	public int Bus_getStatus() {
		return business.getStatus();
	}

	public void Bus_setStatus(int status) {
		business.setStatus(status);
	}

	//---------------------------------MENU CLASS---------------------------------//
	public Menu getMenu() {
		return business.getMenu();
	}

	public void setMenu(Menu menu) {
		business.setMenu(menu);
	}
	

	public void Set_MenuItem(String it, int pri) {
		business.Set_MenuItem(it, pri);
	}
	
	public String getItem(int index) {
		return business.getItem(index);
	}
	public void setItem(String item) {
		business.setItem(item);
	}
	public int getPrice(int index) {
		return business.getPrice(index);
	}
	public void setPrice(int price) {
		business.setPrice(price);
	}

	//---------------------------------ORDER CLASS---------------------------------//

	public Order getOrder() {
		return business.getOrder();
	}

	public void setOrder(Order order) {
		business.setOrder(order);
	}
	
	public void Order_Set_OrderItem(String it, int pri, int id) {
		business.Order_Set_OrderItem(it, pri, id);
	}
	
	public String Order_getItem(int index) {
		return business.Order_getItem(index);
	}
	public void Order_setItem(String item) {
		business.Order_setItem(item);
	}
	public int Order_getPrice(int index) {
		return business.Order_getPrice(index);
	}
	public void Order_setPrice(int price) {
		business.Order_setPrice(price);
	}
	public int Order_getTotalprice() {
		return business.Order_getTotalprice();
	}
	public void Order_setTotalprice(int totalprice) {
		business.Order_setTotalprice(totalprice);
	}
	public int Order_getCus_id() {
		return business.Order_getCus_id();
	}
	public void Order_setCus_id(int cus_id) {
		business.Order_setCus_id(cus_id);
	}

}