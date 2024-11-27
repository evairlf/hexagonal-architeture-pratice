package com.feldmann.architeture_practice.adapters.out;

import com.feldmann.architeture_practice.application.core.domain.Author;
import com.feldmann.architeture_practice.application.ports.out.FindAuthorByFirstNameAndLastNameOutputPort;
import com.feldmann.architeture_practice.application.ports.out.InsertAuthorOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class InsertAuthorAdapter {

    @Autowired
    private InsertAuthorOutputPort insertAuthorOutputPort;

    @Autowired
    private FindAuthorByFirstNameAndLastNameOutputPort findAuthorByFirstNameAndLastNameOutputPort;

    public void saveAuthorsIfNeeded(List<Author> authors){
        authors.forEach(author -> {
            if(author.getId() == null){
                findAuthorByFirstNameAndLastNameOutputPort.find(author.getFirstName(), author.getLastName())
                        .ifPresentOrElse(
                                existingAuthor -> author.setId(existingAuthor.getId()),
                                () -> insertAuthorOutputPort.save(author)
                        );
            }
        });
    }
}