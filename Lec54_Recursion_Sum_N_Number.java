public class Lec54_Recursion_Sum_N_Number {
    public static int printSum(int num) {
        if (num == 1) {
            return 1;
        }

        int Snm1 = printSum(num - 1);
        int Sn = num + Snm1;
        return Sn;

    }
    public static void main(String[] args){

        int n = 10;
        System.out.println(printSum(n));
    }
}
