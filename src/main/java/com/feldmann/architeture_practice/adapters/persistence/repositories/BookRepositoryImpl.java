package com.feldmann.architeture_practice.adapters.persistence.repositories;

import com.feldmann.architeture_practice.application.core.domain.Book;
import com.feldmann.architeture_practice.domain.repositories.BookRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private final SpringDataBookRepository jpaRepository;

    public BookRepositoryImpl(SpringDataBookRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Book save(Book book) {
        return jpaRepository.save(book);
    }

    @Override
    public Optional<Book> fildById(Long id) {
        return jpaRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return jpaRepository.findAll();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return jpaRepository.findByTitleContainingIgnoreCase(title);
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}
