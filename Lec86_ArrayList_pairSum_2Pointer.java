import java.util.ArrayList;

public class Lec86_ArrayList_pairSum_2Pointer
{
    //Two Pointer Concept Used
    public static boolean pairValue(ArrayList<Integer> list, int target)
    {
        int lp = 0, rp = list.size() - 1;
        while (lp != rp)
        {
            if (list.get(lp) + list.get(rp) == target)
            {
                System.out.println(list.get(lp) + "," + list.get(rp));
                return true;
            }
            else if (list.get(lp) + list.get(rp) < target)
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return false;
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

        int target = 8;

        System.out.println(pairValue(list, target));
    }
}
