package com.ust.BookService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Bookdto {
    public Long book_id;
    public String title;
    public String author;
    public int isbn;
    public String genre;
    public String available;
    public String publisher;
}
