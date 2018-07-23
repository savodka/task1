import java.util.Scanner;
/**
 * @author Mickle
 *
 */
public class Base {
    public static void main(String[] args) {
        int var1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of task: 1 - calc, 2 - string array ");
        var1 = scanner.nextInt();
if (var1 == 1) {
    Calculate.calc();
} else if (var1 == 2){
    System.out.println("Please make second unit");
} else {
    System.out.println("Please enter 1 or 2");
        }
        scanner.close();
    }
}
