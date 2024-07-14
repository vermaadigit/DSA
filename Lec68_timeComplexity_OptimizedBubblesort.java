public class Lec68_timeComplexity_OptimizedBubblesort
{
    public static void modifiedBubbleSort(int[] arr)
    {
        for (int turn = 0; turn < arr.length-1; turn++)
        {
            boolean swapped = false;
            for (int j = 0; j < arr.length-1-turn; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
            {
                break;
            }
        }

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {9, 5, 7, 1, 8};
        modifiedBubbleSort(arr);
    }
}
