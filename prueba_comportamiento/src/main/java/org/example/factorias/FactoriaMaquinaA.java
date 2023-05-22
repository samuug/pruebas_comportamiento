package org.example.factorias;

import org.example.machine.Machine;
import org.example.machine.MachineA;

public class FactoriaMaquinaA  extends FactoriaMaquina{
    @Override
    public Machine crearMaquina() {
        return (Machine) new MachineA();
    }
}
