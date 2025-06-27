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
    public static int findMax (int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] > max)
                max = array[i];
        }
        return max;
    }
    public static int findMin (int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
    public static int countElementsToRemove(int[] array, int numberToRemove, boolean removeAll){
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
    public static int[] removeElement(int[] array, int numberToRemove, boolean removeAll){

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
