package com.feldmann.architeture_practice.application.core.usecases;

import com.feldmann.architeture_practice.application.core.domain.Book;
import com.feldmann.architeture_practice.application.ports.in.FindBookByIdInputPort;
import com.feldmann.architeture_practice.application.ports.out.FindBookByIdOutputPort;

import java.util.Optional;

public class FindBookByIdUseCase implements FindBookByIdInputPort {

    public final FindBookByIdOutputPort findBookByIdOutputPort;

    public FindBookByIdUseCase(FindBookByIdOutputPort findBookByIdOutputPort) {
        this.findBookByIdOutputPort = findBookByIdOutputPort;
    }

    @Override
    public Book findById(Long id) {
        return findBookByIdOutputPort.find(id).orElseThrow(() -> new RuntimeException("Book not Found!"));
    }
}
