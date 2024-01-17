package com.librarymanagement.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Lendal {

	public long getLendalId() {
		return lendalId;
	}

	public void setLendalId(long lendalId) {
		this.lendalId = lendalId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public Date getBorrowedDate() {
		return borrowedDate;
	}

	public void setBorrowedDate(Date borrowedDate) {
		this.borrowedDate = borrowedDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public int getFine() {
		return fine;
	}

	public void setFine(int fine) {
		this.fine = fine;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long lendalId;
	
	public long userId;
	
	public long bookId;
	
	public Date borrowedDate;
	
	public Date returnDate;
	
	public int fine;
	
	
}
