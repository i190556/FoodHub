package application;

public class Business {


	private String Contact;
	private String Name;
	private String Address;
	private String Email;
	

	public Business() {
		setContact("");
		setName("");
		setAddress("");
		setEmail("");
	}

	public Business(String cont, String nam, String add, String emai) {
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


}
