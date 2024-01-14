package com.librarymanagement.controller;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.librarymanagement.model.Book;
import com.librarymanagement.service.BookService;


@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book createdBook = bookService.createBook(book);
        return new ResponseEntity<>(createdBook,HttpStatus.CREATED);
    }

    @GetMapping("/getAllBook")
    public ResponseEntity<List<Book>> getAllBooks() {
    	
        List<Book> bookList = bookService.getAllBooks();
        if (!bookList.isEmpty()) {
        	return new ResponseEntity<>(bookList, HttpStatus.OK);
       } else {
            return new ResponseEntity<>(Collections.emptyList(), HttpStatus.OK);
       }
  
    }

    @GetMapping("/getBook")
    public ResponseEntity<Book> getBookById(@RequestParam int id) {
        Optional<Book> book = bookService.getBookById(id);

        return book.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    
    }

    @PutMapping("/updateBook")
    public ResponseEntity<Book> updateBook(@RequestParam int book_id, @RequestBody Book book) {
        Book updatedBook = bookService.updateBook(book_id, book);
        if (updatedBook != null) {
            return new ResponseEntity<>(updatedBook, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/deleteBook")
    public ResponseEntity<Void> deleteBook(@RequestParam int book_id) {
        bookService.deleteBook(book_id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
