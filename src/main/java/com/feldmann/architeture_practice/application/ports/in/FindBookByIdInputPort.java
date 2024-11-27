package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.Book;

import java.util.Optional;

public interface FindBookByIdInputPort {

    Book findById(Long id);

}