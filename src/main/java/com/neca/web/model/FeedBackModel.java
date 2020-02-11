package com.neca.web.model;

public class FeedBackModel {

	private String name;
	private String email;
	private String message;
	private int rating;
	
	public FeedBackModel() {
		super();
	}

	public FeedBackModel(String name, String email, String message, int rating) {
		super();
		this.name = name;
		this.email = email;
		this.message = message;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FeedBackModel [name=" + name + ", email=" + email + ", message=" + message + ", rating=" + rating + "]";
	}
	
}
