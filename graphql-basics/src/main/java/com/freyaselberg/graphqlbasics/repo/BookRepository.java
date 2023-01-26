package com.freyaselberg.graphqlbasics.repo;

import java.util.UUID;

import com.freyaselberg.graphqlbasics.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.r2dbc.core.R2dbcEntityTemplate;
import org.springframework.data.relational.core.query.Criteria;
import org.springframework.data.relational.core.query.Query;
import org.springframework.r2dbc.core.DatabaseClient;
import org.springframework.stereotype.Repository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Gaurav Sharma
 */
@Repository
public class BookRepository {

    @Autowired
    private DatabaseClient client;

    @Autowired
    private R2dbcEntityTemplate template;

    public Mono<Book> getBook(UUID id) {
        return template.select(Book.class).matching(Query.query(Criteria.where("id").is(id))).one();
    }

    public Flux<Book> getBooks() {
        return template.select(Book.class).all();
    }

}