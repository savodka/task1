import java.util.Random;

public class ArrayTwenty {
    public static void arrtw() {
        Random random = new Random();
        int intArray[] = new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(21) - 10;
            System.out.print(intArray[i] + " ");
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int anIntArray : intArray) {
            if (max < anIntArray && anIntArray < 0)
                max = anIntArray;
            if (min > anIntArray && anIntArray > 0)
                min = anIntArray;
        }
        System.out.println("\n" + "Максимальный отрицательный элемент в массиве: " + max);
        System.out.println("Минимальный положительный элемент в массиве: " + min);
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == max) {
                intArray[i] = min;
            } else {
                if (intArray[i] == min) {
                    intArray[i] = max;
                }
            }
        }
        for (int x : intArray) {
            System.out.print(x + " ");
        }
    }
}