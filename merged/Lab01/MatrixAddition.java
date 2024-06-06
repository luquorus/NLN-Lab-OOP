import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user choice for matrix input
        System.out.println("Choose matrix input method:");
        System.out.println("1. Enter the matrices");
        System.out.println("2. Use constant matrices");
        int choice = scanner.nextInt();

        int rows, cols;

        // Input matrices
        if (choice == 1) {
            // Get user input for matrix dimensions
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            // Input the first matrix
            System.out.println("Enter the elements of the first matrix:");
            int[][] matrix1 = inputMatrix(rows, cols);

            // Input the second matrix
            System.out.println("Enter the elements of the second matrix:");
            int[][] matrix2 = inputMatrix(rows, cols);

            // Perform matrix addition
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // Display the result
            System.out.println("\nResultant Matrix:");
            displayMatrix(resultMatrix);
        } else if (choice == 2) {
            // Use constant matrices for testing
            int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

            // Perform matrix addition
            int[][] resultMatrix = addMatrices(matrix1, matrix2);

            // Display the result
            System.out.println("Constant Matrix 1:");
            displayMatrix(matrix1);
            System.out.println("\nConstant Matrix 2:");
            displayMatrix(matrix2);
            System.out.println("\nResultant Matrix:");
            displayMatrix(resultMatrix);
        } else {
            System.out.println("Invalid choice. Exiting program.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    // Function to input a matrix from the user
    static int[][] inputMatrix(int rows, int cols) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to add two matrices
    static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}