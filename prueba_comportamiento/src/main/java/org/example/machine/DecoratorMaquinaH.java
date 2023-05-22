package org.example.machine;

public class DecoratorMaquinaH extends DecoratorMaquina{
    public DecoratorMaquinaH(Machine decoratedMaquina) {
        super(decoratedMaquina);
    }

    @Override
    public boolean iniciarMaquina(Object datosMaquina) {
        return decoratedMaquina.iniciarMaquina(datosMaquina);
    }
}
