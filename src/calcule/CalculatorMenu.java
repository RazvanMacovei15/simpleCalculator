package calcule;

import java.util.Scanner;

public class CalculatorMenu {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to my calculator");

        //Creating Menu
        while (true) {
            System.out.println();
//            System.out.println("Enter first number::");
            float firstNumber = scan.nextFloat();

//            System.out.println("To perform addition, Enter +");
//            System.out.println("To perform subtraction, Enter -");
//            System.out.println("To perform division, Enter *");
//            System.out.println("To perform multiplication, Enter /");
//            System.out.println("To Exit, Enter 0");

            System.out.println();
//            System.out.println("Enter choice::");
            String choice = scan.next();

//            System.out.println("Enter second number::");
            float secondNumber = scan.nextFloat();


            Calcule calcul2 = new Calcule();
            float rezultatAdunare ;
            float rezultatScadere ;
            float rezultatInmultire ;
            float rezultatImpartire ;

            switch (choice) {
                case "+" -> {
//                    System.out.println("Adding the numbers");
                    rezultatAdunare = calcul2.adunare(firstNumber, secondNumber);
                    System.out.println(rezultatAdunare);

                }
                case "-" -> {
//                    System.out.println("Subtracting the numbers");
                    rezultatScadere = calcul2.scadere(firstNumber, secondNumber);
                    System.out.println(rezultatScadere);
                }
                case "/" -> {
//                    System.out.println("Dividing the numbers");
                    rezultatImpartire = calcul2.impartire(firstNumber, secondNumber);
                    System.out.println(rezultatImpartire);
                }
                case "*" -> {
//                    System.out.println("Multiplying the numbers");
                    rezultatInmultire = calcul2.inmultire(firstNumber, secondNumber);
                    System.out.println(rezultatInmultire);
                }
                case " 0 " -> {
                    System.out.println("exit");
                    System.exit(0);
                    break;
                }
                default -> System.out.println("Incorrect input!!! Please re-enter choice from our menu");
            }
        }

    }
}

//lets see if this commit works