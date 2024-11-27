package com.feldmann.architeture_practice.application.core.usecases;

import com.feldmann.architeture_practice.application.core.domain.User;
import com.feldmann.architeture_practice.application.ports.in.InsertUserInputPort;
import com.feldmann.architeture_practice.application.ports.out.FindUserByEmailOutputPort;
import com.feldmann.architeture_practice.application.ports.out.InsertUserOutputPort;

public class CreateUserUseCase implements InsertUserInputPort {

    private final InsertUserOutputPort insertUserOutputPort;

    private final FindUserByEmailOutputPort findUserByEmailOutputPort;

    public CreateUserUseCase(InsertUserOutputPort insertUserOutputPort, FindUserByEmailOutputPort findUserByEmailOutputPort) {
        this.insertUserOutputPort = insertUserOutputPort;
        this.findUserByEmailOutputPort = findUserByEmailOutputPort;
    }


    @Override
    public void save(User user) {
        findUserByEmailOutputPort.findByEmail(user.getEmail())
                .ifPresent(existingUser -> {
                    throw new IllegalArgumentException("Email already registered: " + user.getEmail());
                });
        insertUserOutputPort.save(user);
    }
}
