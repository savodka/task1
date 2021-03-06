import java.util.Scanner;

public class WordsCalc {
    public static void words() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " strings into your array");
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        int maxLengthString = 0;
        String longestWord = null;
        for (String string : strings) {
            if (string.length() > maxLengthString) {
                maxLengthString = string.length();
                longestWord = string;
            }
        }
        System.out.println("The biggest word in your array: " + longestWord);
        scanner.close();
    }
}