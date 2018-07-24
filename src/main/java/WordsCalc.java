import java.util.Scanner;


import java.util.*;

public class WordsCalc {
    public static void words() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int n = scanner.nextInt();
        //int [] a = new int [n];
        System.out.println("Enter " + n + " strings into your array");

        String[] strings = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.next();
        }
        int maxLengthString = 0;
        String longestWord = null;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() > maxLengthString) {
                maxLengthString = strings[i].length();
                longestWord = strings[i];
            }
        }
        System.out.println("The biggest word in your array: " + longestWord);
        scanner.close();
    }
}
