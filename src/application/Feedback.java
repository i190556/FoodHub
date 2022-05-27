package application;

public class Feedback {

	private int rating;
	private String Comment;
	
	private int cus_id;
	private int bus_id;
	
	public Feedback() {
		setRating(0);
		setComment("");
	}
	public Feedback(int rat, String com, int c_id, int b_id) {
		setRating(rat);
		setComment(com);
		setCus_id(c_id);
		setBus_id(b_id);
	}
	
	public void StoreFeedback(int rat, String com, int c_id, int b_id) {
		setRating(rat);
		setComment(com);
		setCus_id(c_id);
		setBus_id(b_id);
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getComment() {
		return Comment;
	}
	public void setComment(String comment) {
		Comment = comment;
	}
	public int getCus_id() {
		return cus_id;
	}
	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}
	public int getBus_id() {
		return bus_id;
	}
	public void setBus_id(int bus_id) {
		this.bus_id = bus_id;
	}
	

}
