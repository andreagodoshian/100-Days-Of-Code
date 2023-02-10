package com.freyaselberg.springbooks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// http://localhost:8080/graphiql?path=/graphql

@SpringBootApplication
public class SpringbooksApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbooksApplication.class, args);
	}

}

/*
Example of a GraphQL queries:
--------------------------------
query {
  findOne(id: 1) {
    title
    pages
  }
}
--------------------------------
query {
  allBooks {
    id
    title
    pages
    rating {
      star
    }
    author {
      firstName
      lastName
    }
  }
}
*/