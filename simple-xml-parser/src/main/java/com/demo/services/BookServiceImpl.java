package com.demo.services;

import com.simplexmlparser.entities.Book;
import com.simplexmlparser.enums.Genre;
import com.simplexmlparser.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void addBook(String id, String author, String title, Genre genre, BigDecimal price, LocalDate publishDate, String description) {
        Book book = new Book(id, author, title, genre, price, publishDate, description);
        this.bookRepository.save(book);
    }
}
