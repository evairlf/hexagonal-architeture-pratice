package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.Author;

import java.util.Optional;

public interface FindAuthorByFirstNameAndLastNameInputPort {

    Optional<Author> findByFirstNameAndLastName(String firstName, String lastName);

}
