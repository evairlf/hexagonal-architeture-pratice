package com.feldmann.architeture_practice.application.ports.out;

import com.feldmann.architeture_practice.application.core.domain.User;

public interface InsertUserOutputPort {

    void save(User user);

}
