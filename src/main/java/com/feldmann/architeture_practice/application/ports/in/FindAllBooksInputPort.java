package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.Book;

import java.util.List;

public interface FindAllBooksInputPort {

    List<Book> findAll();

}
