import java.util.*;
public class Lec14_Sorting_InBuilt {

    public static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){

        int[] arr = {5, 4, 2, 3, 1};

        Arrays.sort(arr);
        printArr(arr);


    }
}
