import rup.Test.AirPlay;
import rup.Test.Cynapp;
import rup.Test.Device;
import rup.Test.Miracast;

import javax.swing.*;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Device D1 = new Miracast();
        Device D2 = new AirPlay();
        Device D3 = new Miracast();
        Device D4 = new AirPlay();

        Cynapp.addDevice(D1);
        Cynapp.addDevice(D2);
        Cynapp.addDevice(D3);
        Cynapp.addDevice(D4);

        for(int i = 0; i < 100; i++){
            System.out.println("Device: ");
            int input = scanner.nextInt();
            Cynapp.showDevice(input);
        }
    }
}