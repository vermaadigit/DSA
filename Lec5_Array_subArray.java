public class Lec5_Array_subArray {

    //Sub Array
    /*
    public static void subArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                for (int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        int[] number = {2, 4, 6, 8, 10, 12};

        subArray(number);

    }

     */

    //Max sum of sub Array
    public static void maxSumArray(int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++){
                    //sub Array Sum
                    currSum += numbers[k];
                }
//                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);
    }
    public static void main(String[] args){

        int[] num = {1, -2, 6, -1, 3};

        maxSumArray(num);
    }
}
