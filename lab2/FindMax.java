import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get array size
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Step 2: Create array
        int[] numbers = new int[n];

        // Step 3: Get array elements
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Find max value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display results
        System.out.println("\n--- Results ---");
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum Value: " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}

