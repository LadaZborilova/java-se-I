package pfarray;

import java.util.Random;
import java.util.Scanner;

public class PFArray {

    public static int[] generateRandomArray() {
        Random r = new Random();
        int min = 3;
        int max = 20;
        int length = r.nextInt(max - min + 1) + min;

        int[] array = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = r.nextInt(201) - 100;
        }

        return array;
    }

    public static int[] generateManualArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elements:");
        int size = scanner.nextInt();

        int[] manualArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            manualArray[i] = scanner.nextInt();
        }

        return manualArray;
    }
}
