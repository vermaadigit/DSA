public class Lec6_Array_Kadanes {

    public static void kadanes(int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++){
            currSum += numbers[i];
            if (currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Maximum SubArray Sum is " + maxSum);
    }
    public static void main(String[] args){

        int[] number = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(number);
    }
}
