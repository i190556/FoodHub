package application;

public class BusinessOwner {

	private String Contact;
	private String Name;
	private String Address;
	private String Email;
	
	private String ID;
	private String Password;
	

	public BusinessOwner() {
		setContact("");
		setName("");
		setAddress("");
		setEmail("");
		
		setID("");
		setPassword("");
	}

	public BusinessOwner(String cont, String nam, String add, String emai, String id, String pass) {
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

}