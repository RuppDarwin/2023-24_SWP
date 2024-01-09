package rup.HausSteuerung.Observer;

public class HeatController implements Observer{
    @Override
    public void inform(float temperature) {
        System.out.println("HeatController: " + temperature + " °C");
    }
}
