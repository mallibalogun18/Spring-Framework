package com.example.SpringFramework.repository;

import com.example.SpringFramework.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
