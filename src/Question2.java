public class Question2 {
    public static void main (String [] args) {

        int x = 150;
        System.out.println("The binary string when x = 150 is " + Integer.toBinaryString(x));

        x = x >> 2;
        System.out.println("When shifted right by 2, x = "+ x + " and the binary notation is " + Integer.toBinaryString(x));


    }
}
