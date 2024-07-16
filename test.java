//Array Insert, Search

public class test
{
    public static int search(int[] arr, int num)
    {
        int index = 0;
        for (int alok = 0; alok < arr.length; alok++)
        {
            if (arr[alok] == num)
            {
               index = alok;
            }
        }
        return index;
    }

    public static void main(String[] args)
    {
        int[] arr = {5,6,7,1,4,2};
        int key = 1;
        System.out.println(search(arr, key));
    }
}