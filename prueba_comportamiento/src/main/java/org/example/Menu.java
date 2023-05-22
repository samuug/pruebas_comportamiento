package org.example;

import org.example.datosMachine.DatosMachineA;
import org.example.datosMachine.DatosMachineH;

import org.example.factorias.FactoriaMaquina;
import org.example.factorias.FactoriaMaquinaA;
import org.example.factorias.FactoriaMaquinaH;
import org.example.machine.*;
import org.example.observers.ResultadoObserver;

import javax.crypto.Mac;

public class Menu {
    public static void menu(){

        FactoriaMaquinaA factoriaA = new FactoriaMaquinaA();
        MachineA mA = (MachineA) factoriaA.crearMaquina();
        DatosMachineA datosA = new DatosMachineA(2,5,'+');

        FactoriaMaquinaH factoriaH = new FactoriaMaquinaH();
        MachineH mH = (MachineH) factoriaH.crearMaquina();
        DatosMachineH datosH = new DatosMachineH(mA,datosA);

        ResultadoObserver resultadoObserver = new ResultadoObserver();
        mH.addObserver(resultadoObserver);

        Machine decoratedMaquinaA = (Machine) new DecoratorMaquinaA(mA);
        Machine decoratedMaquinaH = (Machine) new DecoratorMaquinaH(mH);

        decoratedMaquinaH.iniciarMaquina(datosH);
        decoratedMaquinaA.iniciarMaquina(datosA);
        /*
        // iniciarMaquina notificará automáticamente al observer
        mH.iniciarMaquina(datosH);

        if(mH.iniciarMaquina(datosH)){
            System.out.println("Not Stuck");
        }else{
            System.out.println("Stuck");
        }

         */
    }
}
