import java.util.Arrays;
import java.util.Scanner;

public class ArraySortSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose array input method:");
        System.out.println("1. Enter the array elements");
        System.out.println("2. Use a constant array");
        int choice = scanner.nextInt();

        double[] numericArray;

        if (choice == 1) {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            numericArray = new double[size];

            System.out.println("Enter the array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numericArray[i] = scanner.nextDouble();
            }
        } else if (choice == 2) {
            // constant array
            numericArray = new double[]{5.0, 2.0, 9.5, 1.5, 7.0};
        } else {
            System.out.println("Invalid choice. Exiting program.");
            return;
        }

        Arrays.sort(numericArray);

        double sum = 0;
        for (double num : numericArray) {
            sum += num;
        }

        double average = sum / numericArray.length;

        System.out.println("\nSorted Array: " + Arrays.toString(numericArray));
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("Average of Array Elements: " + average);

        scanner.close();
    }
}

