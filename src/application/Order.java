package application;

public class Order {

	private String item;
	private int price;
	private int totalprice;
	
	private int Cus_id;
	
	public Order() {
		setItem("");
		setPrice(0);
		setTotalprice(0);
	}
	public Order(String it, int pri, int tot) {
		setItem(it);
		setPrice(pri);
		setTotalprice(tot);
	}
	
	public void Set_OrderItem(String it, int pri, int id) {
		setItem(it);
		setPrice(pri);
		setCus_id(id);
	}
	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public int getCus_id() {
		return Cus_id;
	}
	public void setCus_id(int cus_id) {
		Cus_id = cus_id;
	}

}
