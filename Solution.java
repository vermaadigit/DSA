import java.lang.reflect.Array;

public class Solution
{
    public static void maxHeight(int[] arr)
    {
        int minValue = arr[0];
        int minIndex = 0;

        int[] newArr = new int[arr.length];

        //Smallest Number --> Find
        for (int i = 0; i < arr.length; i++)
        {
            if (minValue > arr[i])
            {
                minValue = arr[i];
                minIndex = i;
            }
        }

        for (int index = 0; index < arr.length; index++)
        {
            if (arr[index] == minValue)
            {
                newArr[index] = -1;
            }
            else
            {
                int length = index - minIndex;
                newArr[index] = index - length;
            }
        }

        for (int i = 0; i < newArr.length; i++)
        {
            System.out.print(newArr[i] + " ");
        }

    }
    public static void main(String[] args)
    {
        int[] arr = {1, 3, 2};
        maxHeight(arr);
    }
}
