package com.lifestyleharmonizer.models;

// Local Date is in the format yyyy-MM-dd
import java.time.LocalDate;

// Class to store information related to the Book
public abstract class Book {
	
	// Enum for the genre
	public enum Genre{
		FICTION, NON_FICTION, ACTION, SELF_HELP, MYSTERY, HISTORICAL
	}
	
	// Private Data Fields for book
	private String title;
	private String author;
	private String isbn;
	private int totalPages;
	private Genre genre;
	
	// MetaData fields related to the user
	private LocalDate startDate;
	private LocalDate endDate;
	private int pagesRead;
	
	// The Getters and the Setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public int getPagesRead() {
		return pagesRead;
	}
	public void setPagesRead(int pagesRead) {
		this.pagesRead = pagesRead;
	}
	
	// Constructors
	// Default Constructor
	public Book() {
		title = "";
		author = "";
		isbn = "";
		totalPages = 0;
		startDate = null;
		endDate = null;
		pagesRead = 0;		
	}
	
	// If the user has just the title
	public Book(String title) {
		// this() with these parameters calls the next more specific constructor
		this(title, "");
	}
	// If the user has the title and the author of the book
	public Book(String title, String author) {
		this(title, author, "", 0);
	}
	
	// If the user has the title and the author of the book
	public Book(String title, String author, int totalPages) {
		this(title, author, "", totalPages);
	}
	
	// If the user has the title, author, isbn, and total pages
	public Book(String title, String author, String isbn, int totalPages) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.totalPages = totalPages;
	}
	
	// Makes every class be able to return the type of book that it is
	abstract String getTypeOfBook();
	
	// Overrides the toString() to have a way to display the information of the book
	@Override
	public String toString() {
		return "Book Title: " + title + "\n" +
				"Author: " + author + "\n" +
				"ISBN: " + isbn + "\n" +
				"Total Pages: " + totalPages + "\n" +
				"Genre: " + genre;
	}
}
