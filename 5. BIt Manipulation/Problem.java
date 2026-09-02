public class Problem {

    // Find ODD and EVEN
    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is EVEN Numaber.");
        } else {
            System.out.println(n + " is ODD Numaber.");
        }
    }

    // Check Power of 2 or not
    public static boolean isPowerofTwo(int n){
        return (n & (n-1)) == 0;
    }

    // count set bits in a number
    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String args[]) {
        // oddOrEven(3);   //ODD
        // oddOrEven(11);  //ODD
        // oddOrEven(4);   //EVEN

        // System.out.println(isPowerofTwo(3));

        System.out.println(countSetBits(63));
    }

}