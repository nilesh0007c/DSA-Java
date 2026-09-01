public class BitOperations {
    
    // Get ith bit
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        } else {
            return 1;
        }
    }

    // Set ith bit
    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    // Clear ith bit
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n&bitMask;
    }

    // Update ith bit
    public static int updateIthBit(int n, int i, int newBit){
        // Method 1 using calling functions
    //    if(newBit == 0){
    //          return clearIthBit(n,i);
    //     }else {
    //         return setIthBit(n,i);
    //     }

        // Method 2 without calling function
        n = clearIthBit(n,i);
        int bitMask = newBit << i;
        return n|bitMask;
    }

    // Clear Last i bits
    public static int clearIBits(int n, int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    }

    // Clear Range og bits
    public static int clearBitsinRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask; 
    }

    public static void main(String args[]){
        
        System.out.println(getIthBit(10,2));                 //call function getIthBit
        System.out.println(setIthBit(15,3));                 //call function setIthBit
        System.out.println(clearIthBit(14,2));               //call function clearIthBit
        System.out.println(updateIthBit(20,4,0));    //call function updateIthBit
        System.out.println(clearIBits(5,2));                //call function clearIBits
        System.out.println(clearBitsinRange(20,2,5));    //call function clearBitsinRange
    }
}
