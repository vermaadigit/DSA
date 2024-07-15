public class Lec72_BackTracking_PermtationCombination
{
    public static void findPermutation(String str, String ans)
    {
        //Base Case
        if (str.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        //Recursion
        for (int i = 0; i < str.length(); i++)
        {
            char curr = str.charAt(i);

            //str = str.substring(0, i) + str.substring(i+1, str.length()-1);  ---> Either This
            String newStr = str.substring(0, i) + str.substring(i+1);     //----> Either This
            findPermutation(newStr, ans+curr);
        }
    }
    public static void main(String[] args)
    {
        String str = "abc";
        findPermutation(str, "");
    }
}
