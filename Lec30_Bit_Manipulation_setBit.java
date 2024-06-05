import java.util.Scanner;

public class Lec30_Bit_Manipulation_setBit {
    public static void setBit(int num, int bit){

        int bitmask = 1 << bit;
        int value = num | bitmask;

        System.out.println("Number is "+value);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number - ");
        int num = sc.nextInt();

        System.out.print("Enter Bit - ");
        int bit = sc.nextInt();

        setBit(num, bit);
    }
}
