import java.util.ArrayList;

public class Lec85_ArrayList_pairSum
{
    public static void printPair(ArrayList<Integer> list, int target)
    {
        for (int i = 0; i < list.size(); i++)
        {
            for (int j = i + 1; j < list.size(); j++) {
                int sum = list.get(i) + list.get(j);
                if (sum == target) {
                    System.out.println(list.get(i) + "," + list.get(j));
                }
            }
        }
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;

        printPair(list, target);
    }
}
