package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.Author;

public interface InsertAuthorOutputPort {

    void save(Author author);

}
