public class Lec74_BackTracking_GridWays
{
    public static int gridWays(int i,int j, int n, int m)
    {
        //Base Case
        if (i == n-1 && j == m-1) //Condition for last cell
        {
            return 1;
        } else if (i == n || j == m)  //Boundary cross condition
        {
            return 0;
        }
        int ways1 = gridWays(i + 1, j, n, m);
        int ways2 = gridWays(i, j + 1, n, m);

        return ways1 + ways2;
    }
    public static void main(String[] args)
    {
        int n = 3, m = 3;
        System.out.println(gridWays(0, 0, n, m));
    }
}
