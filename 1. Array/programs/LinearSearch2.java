import java.util.*;

public class LinearSearch2 {
    public static void getLargest(int arr []) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++){
            if ( largest < arr[i] ){
                largest = arr[i];
            }
            if ( smallest > arr[i] ){
                smallest = arr[i];
            }
        }
        System.out.println("largest number in an array is :"+largest);
         System.out.println("smallest number in an array is :"+smallest);
    }
    public static void main (String [] args){
        int arr [] = {1, 2, 6, 3, 5};
        getLargest(arr );
    }
}