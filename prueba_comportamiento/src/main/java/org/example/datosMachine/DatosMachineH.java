package org.example.datosMachine;

import org.example.datosMachine.DatosMachine;

public class DatosMachineH implements DatosMachine {

    Object maquina;

    Object datosMaquina;

    public DatosMachineH(Object maquina, Object datosMaquina) {
        this.maquina = maquina;
        this.datosMaquina = datosMaquina;
    }

    public Object getMaquina() {
        return this.maquina;
    }

    public Object getDatosMaquina() {
        return this.datosMaquina;
    }

    @Override
    public void devolverDatos() {

    }
}
