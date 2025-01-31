//experiment 1
/*Medium Level
Problem Statement: Write a Java program to perform matrix operations (addition, subtraction, and multiplication) on two matrices provided by the user. The program should:
- Check the dimensions of the matrices to ensure valid operations.

Input Example:
Matrix 1:
1 2
3 4
Matrix 2:
5 6
7 8
Output Example:
Addition:
6 8
10 12
Subtraction:
-4 -4
-4 -4
Multiplication:
19 22
43 50
 */
import java.util.Scanner;

public class matrix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix (n x n): ");
        int n = scanner.nextInt();
        
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        int[][] result = new int[n][n];
        
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Choose operation: 1. Addition  2. Subtraction  3. Multiplication");
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                    }
                }
                System.out.println("Sum of matrices:");
                break;
            case 2:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[i][j] = matrix1[i][j] - matrix2[i][j];
                    }
                }
                System.out.println("Difference of matrices:");
                break;
            case 3:
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        result[i][j] = 0;
                        for (int k = 0; k < n; k++) {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
                }
                System.out.println("Product of matrices:");
                break;
            default:
                System.out.println("Invalid choice");
                scanner.close();
                return;
        }
        
        printMatrix(result);
        scanner.close();
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
