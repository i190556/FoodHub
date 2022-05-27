package application;

import java.util.ArrayList;

public class Order {

	private ArrayList<String> item;
	private ArrayList<Integer> price;
	private int totalprice;

	private int Cus_id;
	
	public Order() {
		item = new ArrayList<String>();
		price = new ArrayList<Integer>();
		setTotalprice(0);
	}
	public Order(String it, int pri, int tot) {
		item.add(it);
		price.add(pri);
		setTotalprice(tot);
	}
	
	public void Set_OrderItem(String it, int pri, int id) {
		setItem(it);
		setPrice(pri);
		setCus_id(id);
	}
	
	public String getItem(int index) {
		return item.get(index);
	}
	public void setItem(String it) {
		item.add(it);
	}
	public int getPrice(int index) {
		return price.get(index);
	}
	public void setPrice(int pri) {
		price.add(pri);
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
