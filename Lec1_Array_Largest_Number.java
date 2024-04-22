public class Lec1_Array_Largest_Number {

    public static int getLargest(int[] number)
    {
        int temp = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++)
        {
            if (number[i] > temp)
            {
                temp = number[i];
            }
        }

        return temp;

    }
    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 6, 3, 5};

        System.out.print("Largest Number in an Array " + getLargest(numbers));
    }
}
