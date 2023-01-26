package com.freyaselberg.graphqlbasics.service;

import com.freyaselberg.graphqlbasics.model.Book;
import com.freyaselberg.graphqlbasics.repo.BookRepository;
import graphql.schema.DataFetcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public DataFetcher<CompletableFuture<Book>> getBook() {
        return env -> {
            String bookId = env.getArgument("id");
            return bookRepository.getBook(UUID.fromString(bookId)).toFuture();
        };
    }

    public DataFetcher<CompletableFuture<List<Book>>> getBooks() {
        return env -> bookRepository.getBooks().collectList().toFuture();
    }

}