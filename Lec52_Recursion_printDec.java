import java.util.Scanner;

public class Lec52_Recursion_printDec {
    public static void printDec(int num) {
        if (num == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(num + " ");
        printDec(num - 1);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        printDec(num);
    }
}
