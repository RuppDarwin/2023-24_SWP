import java.util.Scanner;
import java.util.InputMismatchException;

public class Main{
    public static Scanner myObj = new Scanner(System.in);
    public static int Kontostand = 120;
    private static String einzahlen(){
        int input = 0;
        System.out.println("Wie viel möchten sie einzahlen?");
        try {
            input = myObj.nextInt();
        }catch(InputMismatchException notNumber){
            System.err.println("ENTER A NUMBER !");
        }
        Kontostand += input;
        return "Ihr Kontostand beträgt " + Kontostand + "€";
    }
    private static String auszahlen(){
        int input = 0;
        System.out.println("Wie viel möchten sie auszahlen?");
        try {
            input = myObj.nextInt();
        }catch(InputMismatchException notNumber){
            System.err.println("ENTER A NUMBER !");
        }
        Kontostand -= input;
        return "Ihr Kontostand beträgt " + Kontostand + "€";
    }
    private static String getKontostand(){
        return "Ihr Kontostand beträgt " + Kontostand + "€";

    }
    private static boolean cancel(){
        return true;
    }
    public static void main(String[] args){
        boolean cancel = false;
        int choice = 0;
        int output = 0;
        do{
            System.out.println("Sehr geehrter Kunde ihne stehen folgende möglichkeiten zur auswahl: \n 1.einzahlen \n 2.auszahlen \n 3.Kontostand abfragen \n 4.beenden ");
            try {
                choice = myObj.nextInt();

                switch (choice){
                    case 1:
                        System.out.println(einzahlen());
                        break;
                    case 2:
                        System.out.println(auszahlen());
                        break;
                    case 3:
                        System.out.println(getKontostand());
                        break;
                    case 4:
                        cancel = cancel();
                        break;
                }
            }catch(InputMismatchException notNumber){
                System.err.println("ENTER A NUMBER !");
            }
        }while(!cancel);
    }
}