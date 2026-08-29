import java.util.*;

public class SpiralMatrix{

    public static void spiralmatrix(int matrix [][]){
       int startRow = 0;
       int startCol = 0;
       int endRow = matrix.length-1;
       int endCol = matrix[0].length-1;

       System.out.print("{");
        while(startRow <= endRow && startCol <= endCol ){
            //top
            for(int j=startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1; i<=endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            // bottom
            for(int j=endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }
             // left
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

        startRow++;
        startCol++;
        endCol--;
        endRow--;
            
        }
        System.out.print("}");
        System.out.println("");
    }

    public static void diagonalsum(int matrix[][]){
        int sum=0;

        System.out.print("Element in Primary Diagonal :{");
        // Primaray Diagonal
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++)
                if(i==j){
                    System.out.print(matrix[i][j]+",");
                    sum += matrix[i][j];
                }
        }
        System.out.print("}\n");
        

        System.out.print("Element in Secondary Diagonal :{");
        // Secondary Diagonal
        for(int i=0; i<matrix.length; i++){
            for(int j=matrix[0].length; j>=i; j--)
                if(i==j){
                    System.out.print(matrix[i][j]+",");
                    sum += matrix[i][j];
                }
        }
        System.out.print("}\n");

        System.out.println(sum);

    }
    public static void main(String args[]){
        int matrix [][] = {{1,2,3,4},
                           {5,6,7,8},
                           {9,10,11,12},
                           {13,14,15,16}};

        // spiralmatrix(matrix);
        diagonalsum(matrix);
    }
}