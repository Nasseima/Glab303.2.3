//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Question1 {
    public static void main(String[] args) {

        int x = 2;
        System.out.print(" \n The binary string version of 2 is " + Integer.toBinaryString(x));

        x = x << 1;

        // The decimal value is 4.0 and binary string is 100.
        System.out.print(" \n When shifted left by 1 the decimal form of that number is " + Double.valueOf(x));
        System.out.print(" \n When shifted left by 1 the binary notation is " + Integer.toBinaryString(x));






    }
}