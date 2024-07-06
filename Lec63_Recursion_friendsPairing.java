public class Lec63_Recursion_friendsPairing
{
    public static int friendsPairing(int n)
    {
        if (n == 1 || n == 2)
        {
            return n;
        }

        int fnm1 = friendsPairing(n - 1);

        //Pair
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        //totalWays
        int totWays = fnm1 + pairWays;
        return totWays;

        //Either this Single Line ( 10 to 18 )
        //return friendsPairing(n - 1) + (n - 1) * friendsPairing(n - 2);
    }
    public static void main(String[] args)
    {
        System.out.println(friendsPairing(4));
    }
}
