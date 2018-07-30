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
        System.out.println("Enter number of task: 1 - calc, " +
                "2 - string array, 3 - arrayTwenty, 4 - NY Gift ");
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
        } else System.out.println("Please enter 1, 2, 3 or 4");
        scanner.close();
    }
}
