package com.application.bookmanager.repository;

import com.application.bookmanager.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer> {
}
