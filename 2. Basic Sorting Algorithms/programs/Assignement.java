// Use the following sorting algorithms tosort an array in DESCENDING order :
// a.Bubble Sort
// b.Selection Sort
// c.Insertion Sort
// d.Counting Sort


public class Assignement {
     
    // logic of bubbleSort
    public static void bubbleSort(int arr []){
        int n = arr.length;
        for( int turn = 0; turn < n-1; turn++){
            for(int j = 0; j < n-1-turn; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
        
    

    // logic of selectionSort
    public static void selectionSort(int arr []){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            int minPos = i;
            for(int j = i+1; j < n; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        
    }

    // logic of insertionSort
    public static void insertionSort(int arr []){
        int n = arr.length;
        for(int i = 1; i < n ;i++){
            int curr = arr[i];
            int prev = i - 1;
            //finding out the correct pos to insert
            while(prev >= 0 && arr[prev] < curr){
                arr[prev + 1] = arr[prev];
                prev --;
            }
            //insertion
            arr[prev + 1] = curr;
        }
    }

    // logic of countingSort
    public static void countingSort(int arr []){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++ ){
            largest = Math.max(largest, arr[i]);
        }

        int count [] = new int [largest + 1];
        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        //Sorting
        int j = 0;
        for(int i = count.length-1; i >= 0 ; i--){
            while(count [i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // print array
    public static void printArray(int arr []){
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    public static void main(String [] args){

        int arr [] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        System.out.println("Bubble Sort :");
        bubbleSort(arr);
        printArray(arr);

        System.out.println("Selection Sort :");
        selectionSort(arr);
        printArray(arr);

        System.out.println("Insertion Sort :");
        insertionSort(arr);
        printArray(arr);

        System.out.println("Counting Sort :");
        countingSort(arr);
        printArray(arr);
    }
}
