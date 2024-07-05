public class Lec59_Recursion_printPower
{
    public static int printPower(int x, int n)
    {
        if (n == 0)
        {
            return 1;
        }

        int xnm1 = printPower(x, n-1);
        int xn = x * xnm1;
        return xn;
    }
    public static void main(String[] args)
    {
        System.out.println(printPower(2, 10));
    }
}
