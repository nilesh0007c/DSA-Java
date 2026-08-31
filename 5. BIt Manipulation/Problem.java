public class Problem {

    public static void oddOrEven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println(n + " is EVEN Numaber.");
        } else {
            System.out.println(n + " is ODD Numaber.");
        }
    }

    public static void main(String args[]) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(4);
    }
}
