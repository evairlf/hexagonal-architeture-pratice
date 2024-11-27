package com.feldmann.architeture_practice.application.core.usecases;

import com.feldmann.architeture_practice.application.core.domain.Author;
import com.feldmann.architeture_practice.application.ports.in.FindAuthorByIdInputPort;
import com.feldmann.architeture_practice.application.ports.out.FindAuthorByIdOutputPort;

public class FindAuthorUseCase implements FindAuthorByIdInputPort {

    private final FindAuthorByIdOutputPort findAuthorByIdOutputPort;

    public FindAuthorUseCase(FindAuthorByIdOutputPort findAuthorByIdOutputPort) {
        this.findAuthorByIdOutputPort = findAuthorByIdOutputPort;
    }


    @Override
    public Author find(Long id) {
        return findAuthorByIdOutputPort.findById(id).orElseThrow(() -> new RuntimeException("Author not found!"));
    }
}
