package application;

public class Menu {

	private String item;
	private int price;
	
	public Menu() {
		setItem("");
		setPrice(0);
	}
	public Menu(String it, int pri) {
		setItem(it);
		setPrice(pri);
	}
	
	public void Set_MenuItem(String it, int pri) {
		setItem(it);
		setPrice(pri);
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

}
