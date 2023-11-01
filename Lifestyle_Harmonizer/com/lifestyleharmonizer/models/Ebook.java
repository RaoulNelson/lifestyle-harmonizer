package com.lifestyleharmonizer.models;

public class Ebook extends Book{
	// Data Fields
	private String platform;
		
	// Getters and Setters
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	
	// Constructors
	// Default Constructor
	public Ebook() {
		super();
		platform = "";
	}
	
	public Ebook(String title, String author, int totalPages, String platform) {
		super(title, author, totalPages);
		this.platform = platform;		
	}

	@Override
	public String getTypeOfBook() {
		return "Ebook";
	}
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Platform: " + platform;
	}
	
}
