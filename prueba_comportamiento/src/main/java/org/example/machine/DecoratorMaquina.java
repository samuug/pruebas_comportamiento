package org.example.machine;

public abstract class DecoratorMaquina implements InterfazMaquinaDecorator{
    protected Machine decoratedMaquina;

    public DecoratorMaquina(Machine decoratedMaquina) {
        this.decoratedMaquina = decoratedMaquina;
    }

    @Override
    public abstract boolean iniciarMaquina(Object datosMaquina);
}
