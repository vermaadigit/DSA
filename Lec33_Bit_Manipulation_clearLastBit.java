import java.util.Scanner;

public class Lec33_Bit_Manipulation_clearLastBit {
    public static int clearLastBit(int num, int bit){
        int bitMask = ((-1) << bit);

        return num & bitMask;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter Ith Bit - ");
        int bit = sc.nextInt();

        System.out.println(clearLastBit(num, bit));
    }
}
