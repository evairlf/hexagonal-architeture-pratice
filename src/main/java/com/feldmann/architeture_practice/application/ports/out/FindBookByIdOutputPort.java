package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.Book;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface FindBookByIdOutputPort {

   Optional<Book> find(Long id);

}
