package com.ust.BookService.controller;

import com.ust.BookService.model.Book;
import com.ust.BookService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/addbooks")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.addBook(book), HttpStatus.OK);
    }

    @GetMapping("/getbooks")
    public ResponseEntity<List<Book>> getAllBooks() {
        return new ResponseEntity<>(bookService.getAllBooks(), HttpStatus.OK);

    }

    @GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
        Optional<Book> book=bookService.getBookById(id);

        if(book.isPresent()){
            return new ResponseEntity<>(book.get(),HttpStatus.OK);
        }
        else{
            return ResponseEntity.noContent().build();
        }
    }

    @PutMapping("/{id}/availablilty")
   public ResponseEntity<Void>updateAvailablility(Long id,boolean available){
       bookService.updateBookAvailability(id,available);
       return ResponseEntity.noContent().build();
   }

   @DeleteMapping("deletebyid/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id){
        bookService.getBookById(id).ifPresent(book -> bookService.deleteBookById(book));
        return ResponseEntity.noContent().build();
   }


}
