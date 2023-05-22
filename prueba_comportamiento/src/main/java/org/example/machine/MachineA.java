package org.example.machine;

import org.example.datosMachine.DatosMachine;
import org.example.datosMachine.DatosMachineA;
import org.example.observers.Observer;

public class MachineA extends AbstractMaquina{
    public MachineA() {
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    private void notifyObservers(boolean result) {
        for (Observer observer : this.observers) {
            observer.update(result);
        }
    }

    private boolean accionar(Object datosMaquinaA) {
        if (datosMaquinaA instanceof DatosMachineA) {
            DatosMachineA aux = (DatosMachineA) datosMaquinaA;
            if(aux.getN1() instanceof Integer && aux.getN2() instanceof Integer && aux.getCaracter() instanceof Character){
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public boolean iniciarMaquina(Object datosMaquina) {
        boolean result = accionar(datosMaquina);
        notifyObservers(result);
        return result;
    }
}
