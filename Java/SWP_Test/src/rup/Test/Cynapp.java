package rup.Test;

import java.util.ArrayList;
import java.util.List;

public class Cynapp {
    private static List<Device> Devices = new ArrayList<Device>();

    public static void addDevice(Device device){
        Devices.add(device);
    }

    public void setActive(){

    }

    public static void showDevice(int i){
        System.out.println(Devices.get(i - 1).getContent());
    }
}
