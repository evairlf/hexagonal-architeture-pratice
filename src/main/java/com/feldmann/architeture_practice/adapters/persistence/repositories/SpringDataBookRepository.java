package com.feldmann.architeture_practice.adapters.persistence.repositories;

import com.feldmann.architeture_practice.application.core.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpringDataBookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitleContainingIgnoreCase(String title);
}
