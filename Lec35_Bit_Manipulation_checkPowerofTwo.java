import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Lec35_Bit_Manipulation_checkPowerofTwo {
    public static boolean isPowerTwo(int num){

        return (num & (num-1)) == 0;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number - ");
        int num = sc.nextInt();

        System.out.println(isPowerTwo(num));
    }
}
