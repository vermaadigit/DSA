import java.util.*;

public class Lec77_ArrayList
{
    public static void main(String[] args)
    {
        //Java Collection Framework
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);

        System.out.println(list.get(2));

        System.out.println(list.contains(3));

        System.out.println(list.size());
    }
}
