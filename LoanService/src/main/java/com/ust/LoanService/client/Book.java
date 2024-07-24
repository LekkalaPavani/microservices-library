package com.ust.LoanService.client;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book {
    public Long bookId;
    public String title;
    public String author;
    public Long isbn;
    public String genre;
    public boolean available;
    public String publisher;
}
