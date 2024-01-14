package com.librarymanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book")
public class Book { 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int book_id; 
	private String title; 
	private String author; 
	private int available_Copies; 
	private boolean is_Available; 
	// Constructors, getters, setters
	public int getId() {
		return book_id;
	}
	public void setId(int book_id) {
		this.book_id = book_id;
	}
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
	public int getAvailable_Copies() {
		return available_Copies;
	}
	public void setAvailable_Copies(int available_Copies) {
		this.available_Copies = available_Copies;
	}
	public boolean is_Available() {
		return is_Available;
	}
	public void setAvailable(boolean is_Available) {
		this.is_Available = is_Available;
	}
	public Book( String title, String author, int available_Copies, boolean is_Available, int book_id) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.author = author;
		this.available_Copies = available_Copies;
		this.is_Available = is_Available;
	}
	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", title=" + title + ", author=" + author + ", available_Copies="
				+ available_Copies + ", is_Available=" + is_Available + ", getId()=" + getId() + ", getTitle()="
				+ getTitle() + ", getAuthor()=" + getAuthor() + ", getAvailable_Copies()=" + getAvailable_Copies()
				+ ", is_Available()=" + is_Available() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public Book() 
	{
		super();
		
	}
	
}

