import java.util.ArrayList;

public class Lec84_ArrayList_mostWater_2Pointer
{
    public static int maxWater(ArrayList<Integer> height)
    {
        int storedWater = 0;
        int lp = 0;
        int rp = height.size() - 1;

        while (lp < rp)
        {
            //Calculate water area
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            storedWater = Math.max(storedWater, currWater);

            //Update ptr
            if (height.get(lp) < height.get(rp))
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }

        return storedWater;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> height = new ArrayList<>();
        //Height ---> 1 , 8 , 6 , 2 , 5 , 4 , 8 , 3 , 7
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum water capture is " + maxWater(height));
    }
}
