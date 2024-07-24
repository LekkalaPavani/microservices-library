package com.ust.BookService.repository;

import com.ust.BookService.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book,Long> {



}
