public class Lec4_Array_Pair {
    public static void getPair(int[] numbers){

        for (int i = 0; i < numbers.length-1; i++){
            for (int j = i+1; j < numbers.length; j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        int[] number = {7,0,9,1,9};

        getPair(number);
    }
}
