import java.util.Scanner;

public class Lec55_Recursion_Fibonacci {

    //Calculate Nth Term in Fibonacci
    public static int fib(int num)
    {
        if (num == 0 || num == 1)
        {
            return num;
        }
        int fnm1 = fib(num - 1);
        int fnm2 = fib(num - 2);
        int fn = fnm2 + fnm1;
        return fn;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Nth Term - ");
        int num = sc.nextInt();

        System.out.println(fib(num));
    }
}
