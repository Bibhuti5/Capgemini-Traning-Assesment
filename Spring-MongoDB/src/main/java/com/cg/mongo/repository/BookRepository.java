package com.cg.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.mongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
