import java.util.ArrayList;
import java.util.Scanner;

public class Lec79_ArrayList_Maximum
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many number you want to put in Array List : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++)
        {
            System.out.print("Enter Number " + i + " : ");
            list.add(sc.nextInt());
        }

        //int max = list.get(0);
        //int max = Integer.MIN_VALUE;    // Line 21, 23 same gets same value
        int max = list.getFirst();

        for (int i = 0; i < list.size(); i++)
        {
            max = Math.max(max, list.get(i));
        }

        System.out.println(max);
    }
}
