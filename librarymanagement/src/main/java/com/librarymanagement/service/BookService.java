package com.librarymanagement.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarymanagement.model.Book;
import com.librarymanagement.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	
	public Book createBook(Book book) {
		System.out.println("two-c");
		return bookRepository.save(book);
	}

	
	public List<Book> getAllBooks() {
		return bookRepository.findAll();

	}

	public Optional<Book> getBookById(int book_id) {
		return bookRepository.findById(book_id);
		
	}

	
	public Book updateBook(int book_id, Book book) { 
		Optional<Book> existingBookOptional = bookRepository.findById(book_id);
		if (existingBookOptional.isPresent()) {
			Book existingBook = existingBookOptional.get();
			existingBook.setTitle(book.getTitle());
			existingBook.setAuthor(book.getAuthor());
			existingBook.setAvailable_Copies(book.getAvailable_Copies());
			existingBook.setAvailable(book.is_Available());
			return bookRepository.save(existingBook);
		} else {
			return null;
		}
		
	}


	public void deleteBook(int book_id) {
		bookRepository.deleteById(book_id);
		
	}

	

}
