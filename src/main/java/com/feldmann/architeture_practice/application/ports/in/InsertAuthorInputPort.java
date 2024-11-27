package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.Author;

public interface InsertAuthorInputPort {

    void save(Author author);

}
