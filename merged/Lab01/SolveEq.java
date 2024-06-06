import java.util.Scanner;
public class SolveEq {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of equation: ");
        System.out.println("1. The first-degree equation (linear equation) with one variable");
        System.out.println("2. The system of first-degree equations (linear system) with two variables");
        System.out.println("3. The second-degree equation with one variable");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter a and b for the ax + b = 0:");
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            double x = 0.0;
            if (a == 0) {
                System.out.println("Invalid.");
            } else {
                x = -b/a;
                System.out.println("The solution is: " + x);
            }
        } else if (choice == 2) {
            SolveLinearSystem();
        } else if (choice == 3) {
            SolveQuadratic();
        } else System.out.println("Invalid choice.");

        scanner.close();
    }

    private static void SolveLinearSystem() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coefficients a1, b1, c1 for equation 1 (a1x + b1y = c1): ");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double c1 = scanner.nextDouble();

        System.out.print("Enter the coefficients a2, b2, c2 for equation 2 (a2x + b2y = c2): ");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();
        double c2 = scanner.nextDouble();

        double determinant = a1 * b2 - a2 * b1;

        if (determinant != 0) {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("Solution: x = " + x + ", y = " + y);
        } else {
            if ((c1 * b2 - c2 * b1) == 0 && (a1 * c2 - a2 * c1) == 0) {
                System.out.println("Infinite solutions: The system has infinitely many solutions.");
            } else {
                System.out.println("No solution: The system has no solution.");
            }
        }
    }

    private static void SolveQuadratic() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a, b, c for equation ax^2 + bx + c = 0: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (a != 0) {
            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two real roots: x1 = " + root1 + ", x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Double root: x = " + root);
            } else {
                System.out.println("No real roots: The quadratic equation has no real roots.");
            }
        } else {
            System.out.println("Invalid input. Coefficient 'a' should be non-zero.");
        }
    }


}
