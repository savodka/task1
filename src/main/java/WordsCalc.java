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

/*
Поиск максимального слова - в принципе тоже,
но я бы добавил проверку вводимой длины массива ( попробуй ввести 0 и например -1).
Ещё в идеале можно попробовать учесть случай когда в массиве есть несколько слов одинаковой
и максимальной длины. Но это в задании не оговорено, так что на усмотрение.
А вот с массивом чисел что-то не так :) Заполнение и поиск макс/мин - ОК,
но вот с "поменять местами" я не понял. Ты просто меняешь значения в переменных
max/min, это никак не отражается на массиве, там эти числа остаются на своих местах.
Надо поменять их именно в массиве и вывести его еще раз.
 */