public class Lec61_Recursion_tilingProblem
{
    public static int tilingProblem(int n)  //2 x n (Floor Size)
    {
        //Base Case
        if (n == 0 || n == 1)
        {
            return 1;
        }
        //Vertical choise
        int fnm1 = tilingProblem(n - 1);

        //Horizontal choise
        int fnm2 = tilingProblem(n - 2);

        int totWays  = fnm1 + fnm2;
        return totWays;

    }
    public static void main(String[] args)
    {
        System.out.println(tilingProblem(6));
    }
}
