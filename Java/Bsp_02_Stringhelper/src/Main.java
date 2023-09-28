import java.util.Scanner;

public class Main {
    static Scanner myObj = new Scanner(System.in);
    public static String getInput(){
        String input;
        System.out.println("Geben Sie ein Wort ein: ");
        return input = myObj.nextLine();
    }
    public static String getPalindrome(){
        String input = getInput();
        if (stringHelper.isPalindrome(input)){
            return input + " ist ein Palindrom";
        }else {
            return input + " ist kein Palindrom";
        }
    }
    public static String getLength(){
        String input = getInput();
        return input + " hat " + stringHelper.countLetters(input) + "Buchstaben";
    }
    public static boolean getCancel(){
        return true;
    }

    public static String getReverseString(){
        String input = getInput();
        return input + " ist umgedreht " + stringHelper.reverseString(input);
    }

    public static String getAmoundofLetters(){
        String input = getInput();
        return stringHelper.printAmountOfLetters(input);
    }


    public static void main(String[] args) {
        boolean cancel = false;
        int choice = 0;
        do{
            System.out.println("Sie haben folgende auswahl möglichkeiten: \n 1.Palindromfinder \n 2.Buchstaben zählen \n 3.String umdrehen \n 3.Anzahl der Buchstaben ausgeben \n 5.Beenden");
            choice = myObj.nextInt();
            switch(choice) {
                case 1:
                    System.out.println(getPalindrome());
                    break;
                case 2:
                    System.out.println(getLength());
                    break;
                case 3:
                    System.out.println(getReverseString());
                    break;
                case 4:
                    System.out.println(getAmoundofLetters());
                    break;
                case 5:
                    cancel = getCancel();
                    break;
            }

        }while(!cancel);




    }
}