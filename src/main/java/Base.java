import CalculatorOop.Calculation;
import NewYearBox.Cake;
import NewYearBox.Candy;
import NewYearBox.Jellybean;
import NewYearBox.Staff;

import java.util.Scanner;

/**
 * @author Mickle
 * @see Calculate
 * @see WordsCalc
 */
public class Base {
    public static void main(String[] args) {
        int var1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: 1 - calc, " + "\n" +
                "2 - string array, 3 - arrayTwenty, 4 - NY Gift, 5 - OOP Calc ");
        var1 = scanner.nextInt();
        if (var1 == 1) {
            Calculate.calc();
        } else if (var1 == 2) {
            WordsCalc.words();
        } else if (var1 == 3) {
            ArrayTwenty.arrtw();
        } else if (var1 == 4) {
            Candy candy1 = new Candy("Mishka", 20.4, 5.2, 10.0);
            Jellybean jellybean1 = new Jellybean("Pepsi", 10.6, 3.3, "Red");
            Cake cake1 = new Cake("Tort", 30.4, 500.4, "round");
            Staff[] box = {candy1, jellybean1, cake1};
            for (Staff someStaff : box) {
                System.out.println(someStaff.toString());
            }
            double totalweight = 0;
            double totalprice = 0;
            for (Staff someStaff : box) {
                totalweight += someStaff.getWeight();
                totalprice += someStaff.getPrice();
            }
            System.out.println("Общий вес = " + totalweight);
            System.out.println("Общая стоимость = " + totalprice);
        } else if (var1 == 5) {
            float a, b;
            String sign;
            Scanner keyboard = new Scanner(System.in);
            Calculation сal = new Calculation();
            System.out.println("Enter the first number");
            a = keyboard.nextFloat();
            System.out.println("Enter operation (+, -, * or /)");
            sign = keyboard.next();
            System.out.println("Enter the second number");
            b = keyboard.nextFloat();

            if (sign.equals("+")) {
                float c = сal.plus(a, b);
                System.out.println("Answer " + c);
            } else if (sign.equals("-")) {
                float c = сal.subtract(a, b);
                System.out.println("Answer " + c);
            } else if (sign.equals("*")) {
                float c = сal.multiply(a, b);
                System.out.println("Answer " + c);
            } else if (sign.equals("/")) {
                float c = сal.divide(a, b);
                System.out.println("Answer " + c);
            }
        } else {
            System.out.println("Please enter 1, 2, 3, 4 or 5");
        }
        scanner.close();
    }
}
