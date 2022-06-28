package com.example.SpringFramework.repository;

import com.example.SpringFramework.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
