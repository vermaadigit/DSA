import java.util.Scanner;

public class Lec29_Bit_Manipulation_getBit {
    public static void getIthBit(int num, int bit){

        int bitmask = 1 << bit;

        if ((num & bitmask) == 0){
            System.out.println("Given bit is 0");
        }
        else {
            System.out.println("Given bit is 1");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter Ith Bit - ");
        int bit = sc.nextInt();

        getIthBit(num, bit);
    }
}
