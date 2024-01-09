package rup.HausSteuerung.Observer;

public class AwningController implements Observer{
    @Override
    public void inform(float temperature) {
        System.out.println("AwningController: " + temperature + " °C");
    }
}
