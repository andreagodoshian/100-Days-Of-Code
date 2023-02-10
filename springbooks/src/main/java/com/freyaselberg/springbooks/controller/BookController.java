package com.freyaselberg.springbooks.controller;

import com.freyaselberg.springbooks.model.Book;
import com.freyaselberg.springbooks.repo.BookRepository;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller // not Rest because no Get/Post/etc
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // @SchemaMapping(typeName = "Query", value = "allBooks")
    @QueryMapping
    // public List<Book> findAll() {
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

}
