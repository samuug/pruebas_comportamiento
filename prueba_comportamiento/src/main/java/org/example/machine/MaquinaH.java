package org.example.machine;


import org.example.datosMachine.DatosMachineH;
import org.example.observers.Observer;

public class MaquinaH extends AbstractMaquina{

    public MaquinaH() {

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

    private boolean accionar(Object datos) {
        if(datos instanceof DatosMachineH){
            DatosMachineH aux = (DatosMachineH) datos;
            if(aux.getMaquina() instanceof Machine ){
                return ((Machine) aux.getMaquina()).iniciarMaquina(aux.getDatosMaquina());            }
        }
        return false;
    }


    @Override
    public boolean iniciarMaquina(Object datosMaquina) {
        boolean result = accionar(datosMaquina);
        notifyObservers(result);
        return result;
    }


}
