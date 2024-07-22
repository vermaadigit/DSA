public class Lec75_BackTracking_GridWays_Trick
{
    public static int fact(int num)
    {
        int value = 1;
        for (int i = 1; i <= num; i++)
        {
            value = value * i;
        }
        return value;
    }
    public static int gridWays(int n, int m)
    {
        int numerator = fact(n+m-2);
        int denominator = fact(n - 1) * fact(m - 1);

        return numerator / denominator;
    }
    public static void main(String[] args)
    {
        int n = 3, m = 3;
        System.out.println(gridWays(3, 3) + " Ways");
    }
}
