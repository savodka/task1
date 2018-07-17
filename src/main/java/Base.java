import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        float var1, var2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        var1 = scanner.nextFloat();
        System.out.println("Enter the second number ");
        var2 = scanner.nextFloat();
        sum = var1 + var2;
        System.out.printf("Summ is "+ "%.4f", + sum);
        scanner.close();
    }
}
