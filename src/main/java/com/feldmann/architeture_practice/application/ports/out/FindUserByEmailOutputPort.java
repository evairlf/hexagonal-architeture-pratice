package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.User;

import java.util.Optional;

public interface FindUserByEmailOutputPort {

    Optional<User> findByEmail(String email);

}
