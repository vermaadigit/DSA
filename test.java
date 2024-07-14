import java.util.Scanner;
public class test{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[] disA = new int[m];

        int[] disB = new int[n];

        int countA = 0;
        int countO = 0;
        int result1 = 0 ;
        int result2 = 0;

        for(int i=0; i<m; i++){
            disA[i] = sc.nextInt();
            result1 = disA[i]+a;
            if(result1>=start && result1<=end){
                countA++;
            }
        }

        for(int j = 0; j<n; j++){
            disB[j] = sc.nextInt();
            result2 = disB[j]+b;
            if(result2 >= start && result2<=end){
                countO++;
            }
        }

        System.out.println(countA);
        System.out.println(countO);

        System.out.println(System.currentTimeMillis());
    }

}