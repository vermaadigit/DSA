import java.util.ArrayList;

public class Lec82_ArrayList_MultiDimensionArray
{
    public static void main(String[] args)
    {
        /*
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(3);
        list2.add(6);
        list2.add(9);

        mainList.add(list2);

        for (int i = 0; i < mainList.size(); i++)
        {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++)
            {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }

        System.out.println(mainList);

         */

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 1; i < 5; i++)
        {
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        //Adding Lists to Main List
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        //Printing List
        for (int i = 0; i < mainList.size(); i++)
        {
            ArrayList<Integer> currList = mainList.get(i);
            for (int j = 0; j < currList.size(); j++)
            {
                System.out.print(currList.get(j) + " ");
            }
            System.out.println();
        }
    }
}
