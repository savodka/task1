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
        System.out.println("Enter number of task: 1 - calc, 2 - string array, 3 - arrayTwenty ");
        var1 = scanner.nextInt();
        if (var1 == 1) {
            Calculate.calc();
        } else if (var1 == 2) {
            WordsCalc.words();
        } else if (var1 == 3) {
            ArrayTwenty.arrtw();
        } else System.out.println("Please enter 1, 2 or 3");
        scanner.close();
    }
}
