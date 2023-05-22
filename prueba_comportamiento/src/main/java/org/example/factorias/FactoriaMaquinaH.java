package org.example.factorias;

import org.example.machine.Machine;
import org.example.machine.MachineH;

public class FactoriaMaquinaH extends FactoriaMaquina{
    @Override
    public Machine crearMaquina() {
        return (Machine) new MachineH();
    }
}
