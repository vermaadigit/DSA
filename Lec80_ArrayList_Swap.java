import java.util.ArrayList;
import java.util.Scanner;

public class Lec80_ArrayList_Swap
{
    public static void swap(ArrayList<Integer> list, int idx1, int idx2)
    {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
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

        System.out.println();

        System.out.print("Enter First Index : ");
        int idx1 = sc.nextInt();
        System.out.print("Enter Second Index : ");
        int idx2 = sc.nextInt();

        System.out.println(list);
        swap(list, idx1, idx2);
        System.out.println(list);

    }
}
