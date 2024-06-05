import java.util.Scanner;

public class Lec31_Bit_Manipulation_clearBit {
    public static void clearBit(int num, int bit){

        int bitMask = ~(1 << bit);
        int value = num & bitMask;

        System.out.println("Value is " + value);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter a Bit - ");
        int bit = sc.nextInt();

        clearBit(num, bit);
    }
}
