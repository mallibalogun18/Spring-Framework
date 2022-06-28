package com.example.SpringFramework.repository;

import com.example.SpringFramework.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
