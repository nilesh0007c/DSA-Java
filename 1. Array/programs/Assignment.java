public class Assignment {

    // public  static boolean containsDuplicate(int nums []) {

    //     int n = nums.length;

    //     for(int i = 0; i < n-1 ; i++){

    //         for(int j = i+1; j < n; j++){

    //             if( nums[i] == nums[j] ) {
    //                 return true ; 
    //             }
    //         }
    //     }
    //     return false;
    // }


    // public static int buyAndSellStocks(int prices []){
    //     int n = prices.length;
    //     int buyPrice = Integer.MAX_VALUE;
    //     int maxProfit = 0;

    //     for(int i = 0; i < n; i++){
    //         if(buyPrice < prices[i] ){ //profit
    //             int profit = prices[i] - buyPrice; //today's profit
    //             maxProfit = Math.max(maxProfit, profit);
    //         } else {
    //             buyPrice = prices[i];
    //         }
    //     }

    //     return maxProfit;
    // }
    
    public static void containsTriplets(int nums[]){
        int n = nums.length;
        for(int i = 0; i < n; i++ ){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < n; k++){
                    if(nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]){
                        if(nums[i]+nums[j]+nums[k] == 0){
                            System.out.println("["+nums[i]+","+nums[j]+","+nums[k]+"]");
                        }
                    }
                }
            }
        }
    }
    public static void main(String [] args){

        // int nums [] = {1, 2, 3, 4};
        // int prices[] = {7, 6, 4, 3, 1};
         int nums [] ={-1, 0 ,1, 2, -1, -4};

        
    //  System.out.println(containsDuplicate(nums));
    //  System.out.println(buyAndSellStocks(prices));
    containsTriplets(nums);
    }
}
