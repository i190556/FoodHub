package application;

import java.util.ArrayList;

public class Menu {

	private ArrayList<String> item;
	private ArrayList<Integer> price;
	
	public Menu() {
		item = new ArrayList<String>();
		price = new ArrayList<Integer>();
	}
	public Menu(String it, int pri) {
		item.add(it);
		price.add(pri);
	}
	
	public void Add_MenuItem(String it, int pri) {
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

}
