package rup.HausSteuerung.Observer;

import java.util.ArrayList;
import java.util.Random;

public class Thermometer {

    public ArrayList<Observer> ObserverList = new ArrayList<Observer>();

    public float Temperatur;

    public void setTemperatur() {
        Random random = new Random();
        this.Temperatur = random.nextInt(40);
        if(this.Temperatur > 20){
            informAll();
        }
    }

    public void addObserver(Observer observer){
        ObserverList.add(observer);
    }

    public void informAll(){
        for(Observer observer : ObserverList ){
            observer.inform(this.Temperatur);
        }
    }

}
