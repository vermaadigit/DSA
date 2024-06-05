import java.util.Scanner;

public class Lec32_Bit_Manipulation_updateBit {
    public static int setBit(int num, int bit){

        int bitmask = 1 << bit;

        return num | bitmask;
    }

    public static int clearBit(int num, int bit){

        int bitMask = ~(1 << bit);

        return (num & bitMask);
    }

    public static int updateBit(int num, int bit, int newBit){
        if (newBit == 0){
            return clearBit(num, bit);
        }
        else {
            return setBit(num, bit);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter a Bit - ");
        int bit = sc.nextInt();                 //Position of Ith Bit

        System.out.print("Enter a New Bit - ");
        int newBit = sc.nextInt();              //Either 0 and 1

        System.out.print(updateBit(num, bit, newBit));
    }
}
