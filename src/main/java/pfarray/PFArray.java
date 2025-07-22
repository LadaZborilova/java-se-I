package pfarray;

import java.util.Random;
import java.util.Scanner;

public class PFArray {

    private static final Random random = new Random();

    public static int[] generateRandomArray() {

        int minArrayLength = 3;
        int maxArrayLength = 20;
        int arrayLength = random.nextInt(maxArrayLength - minArrayLength + 1) + minArrayLength;

        int[] array = new int[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            array[i] = random.nextInt(201) - 100;
        }

        return array;
    }

    public static int[] generateManualArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many elements do you need?:");
        int size = scanner.nextInt();

        int[] manualArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            manualArray[i] = scanner.nextInt();
        }
        return manualArray;
    }

    public static int[] addElement(int[] oldArray, int newValue) {
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }
        newArray[oldArray.length] = newValue;
        return newArray;
    }

    public static int findMax(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];
        }
        return maxValue;
    }

    public static int findMin(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue)
                minValue = array[i];
        }
        return minValue;
    }

    public static int countElementsToRemove(int[] array, int numberToRemove, boolean removeAll) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToRemove) {
                if (removeAll) {
                    count++;
                } else {
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static int[] removeElement(int[] array, int numberToRemove, boolean removeAll) {

        int count = PFArray.countElementsToRemove(array, numberToRemove, removeAll);
        int[] result = new int[array.length - count];
        int j = 0;

        boolean found = false;

        for (int k : array) {
            if (removeAll && k == numberToRemove) {

            } else if (!removeAll && k == numberToRemove && !found) {
                found = true;
            } else {
                result[j] = k;
                j++;
            }
        }

        return result;
    }

    public static int[] clearArray(int[] array) {
        return null;
    }

}
