package application;

public class Feedback {

	private int rating;
	private String Comment;
	
	public Feedback() {
		setRating(0);
		setComment("");
	}
	public Feedback(int rat, String com) {
		setRating(rat);
		setComment(com);
	}
	
	public void StoreFeedback(int rat, String com) {
		setRating(rat);
		setComment(com);
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
	

}
