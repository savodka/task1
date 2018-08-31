package CalculatorOop;

import java.util.InputMismatchException;
import java.util.Scanner;

//public class Calc {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Calculation cal = new Calculation();
//        float number1;
//        float number2;
//
//        do {
//            System.out.println("Please enter a first number!");
//            while (!sc.hasNextInt()) {
//                System.out.println("That not a number!");
//                sc.next();
//
//            }
//            number1 = sc.nextInt();
//        } while (number1 <= 0);
//        float result = cal.divide(number1, number1);
//           System.out.printf("result = " + "%.4f", (result));
//    }
//}

public class Calc {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Calculation cal = new Calculation();
       try {
            System.out.println("Enter the first number");
            float a = keyboard.nextFloat();
            System.out.println("Enter operator (+, -, * or /)");
            String sign = keyboard.next();
            System.out.println("Enter the second number");
            float b = keyboard.nextFloat();
            float result = cal.calc(sign, a, b);
            System.out.printf("result = " + "%.4f", (result));
        } catch (
                InputMismatchException e) {
            System.err.println(e + " is not the number");
            e.printStackTrace();
        }
    }
}