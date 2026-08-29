import java.util.*;

public class Practice{
    // public static void getMajorityElement(int nums[]){
    //     int frq = 0;
    //     int n = nums.length;
    //     for( int val : nums){
    //         for(int el : nums){
    //             if(val == el){
    //                 frq ++;
    //             }
    //         }
    //         if(frq > n /2){
    //             System.out.println(nums);
    //         }  
    //     }
    //     System.out.println(frq);
    // }

    
    // public static int getRepeatNumber(int nums []){
    //     int n = nums.length;
    //     int count = 1;
    //     for(int i = 0; i < n; i++){
    //         for(int j = i+1; j < n; j++){
    //             if(nums[i]  == nums[j]){
    //                 count += 1;
    //             }
    //             if(count == 2){
    //               return nums[i];
    //             }
    //         }
    //         count = 1;
    //     }
    //     return 0;
    // }

    public static int maxSubArray1(int[] nums) {
        int n = nums.length;
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0; i < n; i++){
            cs = cs + nums[i];
            if(cs < 0){
                if( n == nums[i]){
                    cs = -1;
                }else{
                    cs = 0;
                }
            } 
            ms = Math.max(cs,ms);
        }
        return ms;
    }

    public static void main(String[] args){
        int nums [] = {-2, -1};
        // int nums [] = {3, 1, 3, 4, 2};
        // int nums [] = {3, 3, 3, 3};
        // getMajorityElement(nums);
        // int ans = getRepeatNumber(nums);
        System.out.println(maxSubArray1(nums));
    }
}
