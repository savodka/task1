import java.util.Scanner;


import java.util.*;

public class WordsCalc {
    public static void words() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the array size");
        int n = scanner.nextInt();
        //int [] a = new int [n];
        System.out.println("Enter " + n +" words into your array");

        String[] strings = new String[n];

        for (int i=0; i<n; i++) {
            System.out.print("Enter string " + (i+1) + ": ");
            strings[i] = scanner.next();
        }

        /*System.out.println("The biggest word in your array: ");

        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings. length; i++){
            System.out.println (strings[i]);
        }
        */
        int maxLengthString = 0;
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()>maxLengthString){
                maxLengthString = strings[i].length();
            }
        }
        for(int i=0;i<strings.length;i++){
            if(strings[i].length()==maxLengthString){
                System.out.println("The biggest word in your array: " + strings[i]);
            }
        }


            /*int maximum = string[0];

            for (int i = 0; i < string.length; i++)
                if (maximum < string[i]) maximum = string[i];

            return maximum;*/

        scanner.close();
    }
}
