import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        final int ROWS = 2;
        final int COLUMNS = 3;
        var matrix = new int[ROWS][COLUMNS];
        matrix[0][0] = 100;
        matrix[0][1] = 200;
        matrix[0][2] = 300;
        matrix[1][0] = 400;
        matrix[1][1] = 500;
        matrix[1][2] = 600;
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        // SIMPLIFIED SYNTAX
        var matrixSyntax2 = new int[][] {
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int i = 0; i < matrixSyntax2.length; i++) {
            for (int j = 0; j < matrixSyntax2[i].length; j++) {
                System.out.print(matrixSyntax2[i][j] + " ");
            }
            System.out.println();
        }

        // Add values dynamically
        var console = new Scanner(System.in);
        int rows, columns;
        System.out.print("How many rows? ");
        rows = console.nextInt();
        System.out.print("How many columns? ");
        columns = console.nextInt();
        var matrixDynamic = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter [" + i + "][" + j + "] integer: ");
                matrixDynamic[i][j] = console.nextInt();
            }
        }
        System.out.println("*** MATRIX DYNAMICALLY CREATED ***");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + matrixDynamic[i][j] + "] ");
            }
            System.out.println();
        }
        // Diagonal sum
        int diagonalSum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++)
                if (i == j) diagonalSum += matrixDynamic[i][j];
        }
        System.out.println("Diagonal sum: " + diagonalSum);
    } // end main
}
