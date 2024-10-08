package com.demo.services;

import com.simplexmlparser.entities.Book;
import com.simplexmlparser.enums.Genre;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface BookService {
    void addBook(String id, String author, String title, Genre genre, BigDecimal price, LocalDate publishDate, String description);
}
