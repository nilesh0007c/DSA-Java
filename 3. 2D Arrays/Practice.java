public class Practice {

    public static void sum(int nums[][]){
        int row = 1, col = 0, sum = 0;
        for(col = 0; col < nums[0].length; col++){
            sum = sum + nums[row][col];
        }
        System.out.println("Sum of the numbers in the second row is "+sum);
    }

    public static int countNo(int[][] array,int num){
        int row = 0, col = 0, count = 0 ;
        for(row=0; row<array.length; row++){
            for(col=0; col<array[0].length; col++){
                if(array[row][col] == num){
                    count++;
                }
            }
        }
        System.out.println(count);
        return 0;
    }

    public static void transpose(){
        int[][] matrix ={{11, 12, 13},
                        {21, 22, 23}};

        System.out.print("ROW WISE MATRIX :{\n");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.print("\n");
        }
        System.out.print("}\n");


        int[][] result = new int[3][2];
        int row=0, col=0;
        for(row=0; row<matrix.length;row++){
            for(col=0; col<matrix[0].length; col++){
                result[col][row] = matrix[row][col];
            }
        }

       System.out.print("\nTranspose of a matrix :{\n"); 
        for(int i=0; i<result.length; i++){
            for(int j=0; j<result[0].length; j++){
                System.out.print(result[i][j]+"    ");
            }
            System.out.print("\n");
        }
        System.out.print("}");

    }

    public static void main(String args[]){
        int[][] nums = {{1, 4, 9},
                        {11, 6, 3},
                        {2, 2, 3} };
        
        int[][] array = {{4, 7, 8},
                         {8, 8, 7}};
        int num = 8;
                    
        // sum(nums);
        // countNo(array,num);
        transpose();
    
    }
}
