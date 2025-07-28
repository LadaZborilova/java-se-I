package pfarray;

import java.util.Scanner;

public class MenuService {
    private static final int PRINT_ARRAY = 1;
    private static final int ADD_NUMBER = 2;
    private static final int FIND_MAX = 3;
    private static final int FIND_MIN = 4;
    private static final int REMOVE_NUMBER = 5;
    private static final int CLEAR_ARRAY = 6;
    private static final int EXIT = 7;

    private MenuService() {
    }

    public static void startMenu() {
        System.out.println("How would you like to create the array?\n1 - Enter manually\n2 - Generate randomly");
        int arrayOption = scanner.nextInt();
        int[] myArray;
        if (arrayOption == 1) {
            myArray = PFArray.generateManualArray();
        } else {
            myArray = PFArray.generateRandomArray();
        }
        boolean running = true;
        while (running) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Print array");
            System.out.println("2 - Add number");
            System.out.println("3 - Find max");
            System.out.println("4 - Find min");
            System.out.println("5 - Remove number");
            System.out.println("6 - Clear array");
            System.out.println("7 - Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case PRINT_ARRAY:
                    System.out.println("You chose to print the array");
                    printArray(myArray);
                    break;
                case ADD_NUMBER:
                    System.out.println("You chose to add number");
                    myArray = addNumber(myArray);
                    break;
                case FIND_MAX:
                    System.out.println("You chose to find max");
                    int max = PFArray.findMax(myArray);
                    System.out.println("Maximum number is: " + max);
                    break;
                case FIND_MIN:
                    System.out.println("You chose to find min");
                    int min = PFArray.findMin(myArray);
                    System.out.println("Minimum number is: " + min);
                    break;
                case REMOVE_NUMBER:
                    System.out.println("You chose to remove number");
                    myArray = removeNumber(myArray);
                    break;
                case CLEAR_ARRAY:
                    System.out.println("You chose to clear array");
                    myArray = clearArray(myArray);
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    static Scanner scanner = new Scanner(System.in);

    public static void printArray(int[] MyArray) {
        System.out.println("Current array:");
        for (int num : MyArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] addNumber(int[] MyArray) {
        System.out.println("\nEnter number to add:");
        int newValue = scanner.nextInt();
        MyArray = PFArray.addElement(MyArray, newValue);
        System.out.println("Updated array:");
        printArray(MyArray);
        return MyArray;
    }

    public static int[] removeNumber(int[] myArray) {
        System.out.println("\nEnter number to remove:");
        int numberToRemove = scanner.nextInt();
        myArray = PFArray.removeElement(myArray, numberToRemove, true);
        printArray(myArray);
        return myArray;
    }

    public static int[] clearArray(int[] myArray) {
        myArray = PFArray.clearArray(myArray);
        System.out.println("The array is cleared.");
        return myArray;
    }
}