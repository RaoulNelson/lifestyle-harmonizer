package com.lifestyleharmonizer.models;

public class Manga extends Book{
	// Data fields specific to manga
	private String seriesTitle;
	private int volumeNumber;
	
	// Getters and Setters
	public String getSeriesTitle() {
		return seriesTitle;
	}
	public void setSeriesTitle(String seriesTitle) {
		this.seriesTitle = seriesTitle;
	}
	public int getVolumeNumber() {
		return volumeNumber;
	}
	public void setVolumeNumber(int volumeNumber) {
		this.volumeNumber = volumeNumber;
	}
	
	// Constructors
	// Default Constructor
	public Manga() {
		super();
		seriesTitle = "";
		volumeNumber = 0;
	}
	
	// Case where the user has all these 5 fields for the book
	public Manga(String title, String author, int totalPages, String seriesTitle, int volumeNumber) {
		super(title, author, totalPages);
		this.seriesTitle = seriesTitle;
		this.volumeNumber = volumeNumber;
	}
	
	// Returns the type of book
	@Override
	String getTypeOfBook() {
		return "Manga";
	}	
	
	// Overrides the toString() to have a way to display the information of the book
	@Override
	public String toString() {
		return super.toString() + "\n" +
				"Series Title: " + seriesTitle + "\n" +
				"Volume Number" + volumeNumber;
	}
}
