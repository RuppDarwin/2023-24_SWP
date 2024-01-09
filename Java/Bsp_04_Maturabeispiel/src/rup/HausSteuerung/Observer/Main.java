package rup.HausSteuerung.Observer;

import rup.HausSteuerung.Observer.AwningController;
import rup.HausSteuerung.Observer.HeatController;
import rup.HausSteuerung.Observer.Thermometer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        AwningController Ac1 = new AwningController();
        AwningController Ac2 = new AwningController();
        HeatController Hc1 = new HeatController();
        HeatController Hc2 = new HeatController();

        Thermometer T1 = new Thermometer();
        T1.addObserver(Ac1);
        T1.addObserver(Hc2);

        for(int i = 0; i < 40; i++){
            T1.setTemperatur();
        }
    }
}