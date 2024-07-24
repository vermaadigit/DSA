import java.util.ArrayList;

public class Lec83_ArrayList_mostWater
{
    public static int storeWater(ArrayList<Integer> height)
    {
        int maxWater = 0;

        for (int i = 0; i < height.size(); i++)
        {
            for (int j = i + 1; j < height.size(); j++)
            {
                int lenPole = Math.min(height.get(i), height.get(j));
                int width = j - i;
                int water = lenPole * width;

                if (water > maxWater)
                {
                    maxWater = water;
                }
            }
        }
        return maxWater;
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

        System.out.println("Maximum water capture is " + storeWater(height));

        /*
        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < height.size(); i++)
        {
            for (int j = i + 1; j < height.size(); j++)
            {
                int len = Math.min(height.get(i), height.get(j));
                int width = j-i;
                int value = len * width;

                if (value > maxWater)
                {
                    maxWater = value;
                }
            }
        }

        System.out.println(maxWater);
         */
    }
}
