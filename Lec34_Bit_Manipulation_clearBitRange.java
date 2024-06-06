import java.util.Scanner;

public class Lec34_Bit_Manipulation_clearBitRange {
    public static int clearBitinRange(int num, int i, int j){

        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;

        int bitMask = a | b;

        return num & bitMask;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter value of i - ");
        int i = sc.nextInt();

        System.out.print("Enter value of j - ");
        int j = sc.nextInt();

        System.out.println(clearBitinRange(num, i, j));
    }
}
