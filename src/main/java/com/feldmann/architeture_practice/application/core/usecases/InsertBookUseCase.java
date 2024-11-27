package com.feldmann.architeture_practice.application.core.usecases;

import com.feldmann.architeture_practice.adapters.out.InsertAuthorAdapter;
import com.feldmann.architeture_practice.application.core.domain.Author;
import com.feldmann.architeture_practice.application.core.domain.Book;
import com.feldmann.architeture_practice.application.ports.in.FindAuthorByFirstNameAndLastNameInputPort;
import com.feldmann.architeture_practice.application.ports.in.InsertBookInputPort;
import com.feldmann.architeture_practice.application.ports.out.FindAuthorByFirstNameAndLastNameOutputPort;
import com.feldmann.architeture_practice.application.ports.out.InsertAuthorOutputPort;
import com.feldmann.architeture_practice.application.ports.out.InsertBookOutputPort;

import java.util.List;
import java.util.Optional;

public class InsertBookUseCase implements InsertBookInputPort {

    private final InsertBookOutputPort insertBookOutputPort;

    private final InsertAuthorOutputPort insertAuthorOutputPort;

    private final InsertAuthorAdapter insertAuthorAdapter;


    public InsertBookUseCase(
            InsertBookOutputPort insertBookOutputPort,
            InsertAuthorOutputPort insertAuthorOutputPort,
            InsertAuthorAdapter insertAuthorAdapter)
    {
        this.insertBookOutputPort = insertBookOutputPort;
        this.insertAuthorOutputPort = insertAuthorOutputPort;
        this.insertAuthorAdapter = insertAuthorAdapter;
    }

    @Override
    public void save(Book book) {
        insertAuthorAdapter.saveAuthorsIfNeeded(book.getAuthors());
        insertBookOutputPort.save(book);
    }

}