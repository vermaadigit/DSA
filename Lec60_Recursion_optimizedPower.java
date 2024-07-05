public class Lec60_Recursion_optimizedPower
{
    public static int optimizedPower(int a, int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int halfPower = optimizedPower(a, n/2);
        int halfPowerSq = halfPower * halfPower;

        //n ---> odd
        if (n % 2 != 0)
        {
            halfPowerSq = a * halfPowerSq;
        }

        return halfPowerSq;
    }
    public static void main(String[] args)
    {
        int num = 2;
        int power = 10;
        System.out.println(optimizedPower(num, power));
    }
}
