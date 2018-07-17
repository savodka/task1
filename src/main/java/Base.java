import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        //float var1, var2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        float var1 = scanner.nextInt();
        System.out.println("Enter the second number ");
        float var2 = scanner.nextInt();
        float sum = var1 + var2;
        /*System.out.println("Enter the first number " + var1);
        System.out.println("Enter the second number " + var2);*/
        System.out.printf("Summ is " + sum);
        scanner.close();
    }
}
