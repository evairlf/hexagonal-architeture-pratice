package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.Book;

public interface InsertBookOutputPort {

    void save(Book book);

}
