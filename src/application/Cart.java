package application;

import java.util.ArrayList;

public class Cart {

	private ArrayList<String> item;
	private ArrayList<Integer> price;
	private int totalprice;
	
	public Cart() {
		item = new ArrayList<String>();
		price = new ArrayList<Integer>();
		setTotalprice(0);
	}
	public Cart(String it, int pri, int tot) {
		item.add(it);
		price.add(pri);
		setTotalprice(tot);
	}
	
	public void Set_Cart(String it, int pri) {
		setItem(it);
		setPrice(pri);
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

}
