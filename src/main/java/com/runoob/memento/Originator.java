package com.runoob.memento;

import lombok.Getter;
import lombok.Setter;

public class Originator {

    @Getter
    @Setter
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
