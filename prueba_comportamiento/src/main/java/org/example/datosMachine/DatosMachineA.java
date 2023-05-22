package org.example.datosMachine;

public class DatosMachineA implements DatosMachine{
    Object n1;
    Object n2;
    Object caracter;

    public DatosMachineA(Object n1, Object n2, Object caracter) {
        this.n1 = n1;
        this.n2 = n2;
        this.caracter = caracter;
    }

    public Object getN1() {
        return n1;
    }

    public Object getN2() {
        return n2;
    }

    public Object getCaracter() {
        return caracter;
    }


    @Override
    public void devolverDatos() {
        System.out.println("DatosMachineA{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                ", caracter=" + caracter +
                '}');
    }
}
