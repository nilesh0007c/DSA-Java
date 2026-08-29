import java.util.*;
public class LinearSearch {
    public static int numbers(int nums[], int key){
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int find(String menu[], String item){
        for (int i = 0; i < menu.length; i++ ){
            if(menu[i] == item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int index ;
        int nums [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;
        index = numbers(nums, key);
        if (index == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + index);
        }

        String menu [] = {"Dosa", "Idali", "Samosa", "Chai", "Cold-Drinks"};
        String item = "Coffee";

        index = find(menu, item);
       
        if (index == -1){
            System.out.println("Item not found in the menu");
        } else {
            System.out.println("Item found at index: " + index);
        }


    }
}
