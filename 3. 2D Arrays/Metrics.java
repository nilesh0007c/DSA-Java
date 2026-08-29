import java.util.*;

public class Metrics {

    public static void search(int matrix[][], int key) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Position of the element " + key + " at (" + i + "," + j + ")");
                } 
            }
        }
        // System.out.println("Position of the element " + key + " is not found!");
    }

     public static void largest(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int max = matrix[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max > matrix[i][j]) {
                    System.out.println("Largest element in 2D Array is : " + matrix[i][j]);
                } 
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements for 2D array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }

        // search(matrix, 5);
        largest(matrix);

    }
}
