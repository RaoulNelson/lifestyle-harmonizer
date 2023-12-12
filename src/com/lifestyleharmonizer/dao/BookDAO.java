package com.lifestyleharmonizer.dao;

// Need to import Book class since it is in a separate package
import com.lifestyleharmonizer.models.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	// Creates a new Array list
	private static List<Book> bookList = new ArrayList<>();
	
	// Adds a book to the end of the list
	public void addBook(Book book) {
	bookList.add(book);
	}
	
	// Returns all of the books in the list
	public List<Book> getAllBooks() {
		return bookList;
	}
	
	// Searches and returns a specific book requested by name
	public Book getBookByTitle(String title) {
		// Enhanced for loop that iterates through list to find a matching title
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        // Otherwise, book is not found
        return null; 
    }
	
	// Updates a book
	public int updateBookByTitle(String title, String newAuthor, int newTotalPages) {
	    for (int i = 0; i < bookList.size(); i++) {
	    	// If the title requested matches a book in the list, update the book with the new fields
	        if (bookList.get(i).getTitle().equalsIgnoreCase(title)) {
	            Book bookToUpdate = bookList.get(i);
	            bookToUpdate.setAuthor(newAuthor);
	            bookToUpdate.setTotalPages(newTotalPages);
	            // The book was found and updated successfully
	            return 1; 
	        }
	    }
	    // The book was not found and update was not successful
	    return 0;
	}
	// Deletes a book by title	
	public int deleteBookByTitle(String title) {
	    for (int i = 0; i < bookList.size(); i++) {
	    	// If the title requested matches a book in the list, delete the book
	        if (bookList.get(i).getTitle().equalsIgnoreCase(title)) {
	            bookList.remove(i);
	            // The book was found and deleted successfully
	            return 1;
	        }
	    }
	    // The book wasn't found in the list and the delete was not successful	
	    return 0;  
	}
}

	
	
	
