package com.ust.BookService.service;

import com.ust.BookService.model.Book;
import com.ust.BookService.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepo bookRepo;

    public Book addBook(Book book) {
        return bookRepo.save(book);
    }

    public Optional<Book> getBookById(Long id) {
        return bookRepo.findById(id);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }



    public void updateBookAvailability(Long bookId, boolean available) {
        Book book = bookRepo.findById(bookId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid book ID"));

        book.setAvailable(available);
        bookRepo.save(book);
    }

    public void deleteBookById(Book book) {
        bookRepo.delete(book);
    }


}
