import java.util.Scanner;
/**
 * @author Mickle
 *
 */
public class Base {
    public static void main(String[] args) {
        float var1, var2;
        String operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        var1 = scanner.nextFloat();
        System.out.println("Enter the operator ");
        operator = scanner.next();
        System.out.println("Enter the second number ");
        var2 = scanner.nextFloat();

        if (operator.equals("*")) {
            System.out.printf("= " + "%.4f", (var1 * var2));
        }
        if (operator.equals("/")) {
            System.out.printf("= " + "%.4f", (var1 / var2));
        }
        if (operator.equals("+")) {
            System.out.printf("= " + "%.4f", (var1 + var2));
        }
        if (operator.equals("-")) {
            System.out.printf("= " + "%.4f", (var1 - var2));
        }
        scanner.close();
    }
}
