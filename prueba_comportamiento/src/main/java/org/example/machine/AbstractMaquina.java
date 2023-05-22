package org.example.machine;

import org.example.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMaquina implements Machine{
    protected List<Observer> observers;

    public AbstractMaquina() {
        this.observers = new ArrayList<>();
    }

    @Override
    public abstract boolean iniciarMaquina(Object datosMaquina);
}
