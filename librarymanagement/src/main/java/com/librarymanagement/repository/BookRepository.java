package com.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarymanagement.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {



}	

