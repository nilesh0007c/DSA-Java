import java.util.Arrays;
import java.util.Collections;

public class InBuildSort {

    public static void printArray(Integer arr []){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String [] args){
        Integer arr [] ={5, 4, 1, 2, 3};
        System.out.println("For Asending Order :");
        Arrays.sort(arr);
        printArray(arr);
        System.out.println("For Deasending Order :");
        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
