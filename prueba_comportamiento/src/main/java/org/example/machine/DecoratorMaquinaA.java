package org.example.machine;

public class DecoratorMaquinaA extends DecoratorMaquina{
    public DecoratorMaquinaA(Machine decoratedMaquina) {
        super(decoratedMaquina);
    }

    @Override
    public boolean iniciarMaquina(Object datosMaquina) {
        return decoratedMaquina.iniciarMaquina(datosMaquina);
    }
}
