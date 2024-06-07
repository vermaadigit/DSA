import java.util.Scanner;

public class Lec37_Bit_Manipulation_fastExpo {
    public static int fastExpo(int num, int pow){
        int ans = 1;

        while (pow > 0)
        {
            if ((pow & 1) != 0)
            {
                ans = ans * num;
            }
            num = num * num;

            pow = pow >> 1;

        }
        return ans;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.print("Enter a Power - ");
        int pow = sc.nextInt();

        System.out.println(fastExpo(num, pow));
    }
}
