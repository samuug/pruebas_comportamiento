package org.example.observers;


public class ResultadoObserver implements Observer {
    @Override
    public void update(boolean result) {
        if (result) {
            System.out.println("Not Stuck");
        } else {
            System.out.println("Stuck");
        }
    }
}

