package application;

public class Cart {

	private String item;
	private int price;
	private int totalprice;
	
	public Cart() {
		setItem("");
		setPrice(0);
		setTotalprice(0);
	}
	public Cart(String it, int pri, int tot) {
		setItem(it);
		setPrice(pri);
		setTotalprice(tot);
	}
	
	public void Set_Cart(String it, int pri) {
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
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}

}
