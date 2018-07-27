import java.util.Random;

public class ArrayTwenty {
    public static void arrtw() {
        Random random = new Random();
        int intArray[] = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(21) - 10;
            System.out.println(intArray[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (max < intArray[i] && intArray[i] < 0)
                max = intArray[i];
        }
        System.out.println("Максимальный отрицательный элемент в массиве: " + max);

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i] && intArray[i] > 0)
                min = intArray[i];
        }
        System.out.println("Минимальный положительный элемент в массиве: " + min);
    }
}
