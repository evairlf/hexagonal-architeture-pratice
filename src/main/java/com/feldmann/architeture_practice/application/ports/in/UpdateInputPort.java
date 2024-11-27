package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.Book;

public interface UpdateInputPort {

    void update(Book book);

}