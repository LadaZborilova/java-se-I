package pfarray;

import java.util.Scanner;

public class MenuService {
    public static void startMenu() {
        System.out.println("How would you like to create the array?\n1 - Enter manually\n2 - Generate randomly");
        Scanner scanner = new Scanner(System.in);
        int array_option = scanner.nextInt();
        int[] myArray;
        if (array_option == 1) {
            myArray = PFArray.generateManualArray();
        } else {
            myArray = PFArray.generateRandomArray();
        }

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1 - Print array");
            System.out.println("2 - Add number");
            System.out.println("3 - Find max");
            System.out.println("4 - Find min");
            System.out.println("5 - Remove number");
            System.out.println("6 - Clear array");
            System.out.println("7 - Exit");

            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You chose to print the array");
            } else if (choice == 2) {
                System.out.println("You chose to add number");
            } else if (choice == 3) {
                System.out.println("You chose to find max");
                int max = PFArray.findMax(myArray);
                System.out.println("Maximum number is: " + max);
            } else if (choice == 4) {
                System.out.println("You chose to find min");
                int min = PFArray.findMin(myArray);
                System.out.println("Minimum number is: " + min);
            } else if (choice == 5) {
                System.out.println("You chose to remove number");
            } else if (choice == 6) {
                System.out.println("You chose to clear array");
            } else if (choice == 7) {
                System.out.println("Goodbye!");
                break;
            }
            if (choice == 1) {
                System.out.println("Current array:");
                for (int num : myArray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            if (choice == 2) {
                System.out.println("\nEnter number to add:");
                int newValue = scanner.nextInt();
                myArray = PFArray.addElement(myArray, newValue);
                System.out.println("Updated array:");
                for (int num : myArray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            if (choice == 5) {
                System.out.println("\nEnter number to remove:");
                int numberToRemove = scanner.nextInt();
                myArray = PFArray.removeElement(myArray, numberToRemove, true);
                System.out.println("Updated array:");
                for (int num : myArray) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
            if (choice == 6) {
                System.out.println("\nEnter number to clear array:");
                myArray = PFArray.clearArray(myArray);
                System.out.println("The array is cleared.");
            }
        }
    }
}
