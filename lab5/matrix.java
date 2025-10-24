

import java.util.InputMismatchException;
import java.util.Scanner;

public class matrix{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int N = 3; // matrix size (3x3)

        System.out.println("Enter values for the first " + N + "x" + N + " matrix (Matrix A):");
        int[][] matrixA = readMatrix(scanner, N, "A");

        System.out.println("\nEnter values for the second " + N + "x" + N + " matrix (Matrix B):");
        int[][] matrixB = readMatrix(scanner, N, "B");

        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        System.out.println("\nResult of A * B:");
        printMatrix(resultMatrix);

        scanner.close();
    }

    public static int[][] readMatrix(Scanner scanner, int n, String name) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                while (true) {
                    try {
                        System.out.print("Enter value for " + name + "[" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.print("Invalid input. Please enter an integer. ");
                        scanner.next(); // consume bad token
                    }
                }
            }
        }
        return matrix;
    }

    public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions incompatible for multiplication.");
        }

        int[][] res = new int[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                res[i][j] = 0;
                for (int k = 0; k < colsA; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}  