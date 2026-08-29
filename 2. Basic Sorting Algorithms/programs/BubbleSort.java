public class BubbleSort{

    public static void bubbleSort(int arr []){
        int n = arr.length;
        int swap = 0;
        for( int turn = 0; turn < n-1; turn++){
            for(int j = 0; j < n-1-turn; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap ++;
                }
            }
        }
        System.out.println("Total Swapping :"+swap);
    }
    
    public static void printArray(int arr []){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String [] args){
        int arr [] ={5, 4, 1, 2, 3};
        // int arr [] ={1, 2, 3, 4, 5};
        bubbleSort(arr);
        printArray(arr);
    }
}