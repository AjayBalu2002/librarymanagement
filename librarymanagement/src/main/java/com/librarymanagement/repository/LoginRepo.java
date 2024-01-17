package com.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.librarymanagement.model.Book;
import com.librarymanagement.model.UserInfo;

public interface LoginRepo extends JpaRepository<UserInfo, Long> {

	UserInfo findByEmail(String email);

}
