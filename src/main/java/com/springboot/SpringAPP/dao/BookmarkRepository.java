package com.springboot.SpringAPP.dao;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.SpringAPP.domain.BookMark;

public interface BookmarkRepository extends JpaRepository<BookMark, Long>{
	Collection<BookMark> findByAccountUsername(String username);
}
