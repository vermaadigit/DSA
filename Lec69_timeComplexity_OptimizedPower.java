public class Lec69_timeComplexity_OptimizedPower
{
    public static int optimizedPower(int a, int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int halfPowersq = optimizedPower(a, n/2) * optimizedPower(a, n/2);

        if (n % 2 != 0)
        {
            return a * halfPowersq;
        }

        return halfPowersq;
    }
    public static void main(String[] args)
    {
        int num = 2;
        int pow = 10;

        System.out.println(optimizedPower(num, pow));
    }
}
