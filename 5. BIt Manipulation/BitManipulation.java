class BitManipulation {

    public static void main(String args[]) {
        int a = 5;
        int b = 6;

        // Binary AND
        System.out.println(a&b);    //4

        // Binary OR
        System.out.println(a|b);    //7

        // Binary XOR
        System.out.println(a^b);    //3

        // Binary One's Complement
        System.out.println(~a);     //-6

        // Binary Left Shift
        System.out.println(a<<2);   //20

        // Binary Right Shift
        System.out.println(b>>1);   //3

    }
}