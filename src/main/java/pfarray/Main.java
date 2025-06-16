package pfarray;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = PFArray.generateRandomArray();
        System.out.println("Random array:");
        for (int num : randomArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n");

        int[] manualArray = PFArray.generateManualArray();
        System.out.println("Manual array:");
        for (int num : manualArray) {
            System.out.print(num + " ");
        }
    }
}
