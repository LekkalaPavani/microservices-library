package com.ust.BookService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="book")
public class Book {
    @Id
    public Long bookId;
    public String title;
    public String author;
    public Long isbn;
    public String genre;
    public boolean available;
    public String publisher;

}
