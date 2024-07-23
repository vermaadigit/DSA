import java.util.ArrayList;
import java.util.Scanner;

public class Lec78_ArrayList_Reverse
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. you want : ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++)
        {
            list.add(sc.nextInt());
        }

        //Reverse Array List
        for (int i = list.size()-1; i >= 0; i--)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
