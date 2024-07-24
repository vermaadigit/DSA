import java.util.ArrayList;
import java.util.Collections;

public class Lec81_ArrayList_Sorting
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(12);
        list.add(5);
        list.add(3);
        list.add(9);

        //Ascending Order
        Collections.sort(list);
        System.out.println(list);

        //Descending Order
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
}
