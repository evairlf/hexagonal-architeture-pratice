package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.Author;

import java.util.Optional;

public interface FindAuthorByIdOutputPort {

    Optional<Author> findById(Long id);

}
