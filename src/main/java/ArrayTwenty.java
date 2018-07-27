import java.util.Random;

public class ArrayTwenty {
    public static void arrtw() {
        Random random = new Random();
        int intArray[]=new int[20];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=random.nextInt(21)-10;
            System.out.println(intArray[i]);
        }
        double max = Double.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++){
            max = Math.max(max, intArray[i]);

        }
        System.out.println("Максимальный элемент в массиве: " + max);
        double min = Double.MIN_VALUE;
        for (int i = 0; i < intArray.length; i++){
            min = Math.min(min, intArray[i]);

        }
        System.out.println("Минимальный элемент в массиве: " + min);
    }

}
