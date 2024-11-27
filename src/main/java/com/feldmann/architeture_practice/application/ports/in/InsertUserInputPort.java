package com.feldmann.architeture_practice.application.ports.in;

import com.feldmann.architeture_practice.application.core.domain.User;

public interface InsertUserInputPort {

    void save(User user);

}
