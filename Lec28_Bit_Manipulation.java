import java.util.Scanner;

public class Lec28_Bit_Manipulation {
    public static boolean checkOddEven(int num){
        int bitmask = 1;

        if ((num & bitmask) == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        if (checkOddEven(num) == true){
            System.out.print("Given Number is Even");
        }
        else {
            System.out.println("Given Number is Odd");
        }
    }
}
