package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.Book;

public interface UpdateOutputPort {

    void update(Book book);

}