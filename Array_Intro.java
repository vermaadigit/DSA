import java.util.Scanner;

public class Array_Intro {
    public static int linearSearch(int[] number, int key){
        for (int i = 0; i<number.length; i++)
        {
            if (number[i] == key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int[] number = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;

        System.out.println("Index is " + linearSearch(number, key));

    }
}
