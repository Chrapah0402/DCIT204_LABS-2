import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create array and get elements
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute force search for a pair
        boolean found = false;

        System.out.println("\n--- Results ---");
        for (int i = 0; i < n && !found; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Pair Found!");
                    System.out.println("Index " + i + " (Value: " + numbers[i] + ") + "
                            + "Index " + j + " (Value: " + numbers[j] + ")");
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                    break;
                }
            }
        }

        // Step 5: No pair found
        if (!found) {
            System.out.println("No pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}
