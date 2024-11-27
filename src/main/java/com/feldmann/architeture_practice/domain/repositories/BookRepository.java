package com.feldmann.architeture_practice.domain.repositories;

import com.feldmann.architeture_practice.application.core.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Book save(Book book);

    Optional<Book> fildById(Long id);

    List<Book> findAll();

    List<Book> findByTitle(String title);

    void deleteById(Long id);
}
