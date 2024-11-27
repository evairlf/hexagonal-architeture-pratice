package com.feldmann.architeture_practice.application.core.usecases;

import com.feldmann.architeture_practice.application.ports.in.DeleteBookByIdInputPort;
import com.feldmann.architeture_practice.application.ports.out.DeleteBookByIdOutputPort;
import com.feldmann.architeture_practice.application.ports.out.FindBookByIdOutputPort;

public class DeleteBookByIdUseCase implements DeleteBookByIdInputPort {

    private final FindBookByIdOutputPort findBookByIdOutputPort;

    private final DeleteBookByIdOutputPort deleteBookByIdOutputPort;

    public DeleteBookByIdUseCase(FindBookByIdOutputPort findBookByIdOutputPort, DeleteBookByIdOutputPort deleteBookByIdOutputPort) {
        this.findBookByIdOutputPort = findBookByIdOutputPort;
        this.deleteBookByIdOutputPort = deleteBookByIdOutputPort;
    }

    @Override
    public void delete(Long id) {
        findBookByIdOutputPort.find(id);
        deleteBookByIdOutputPort.delete(id);
    }
}
