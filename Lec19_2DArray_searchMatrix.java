import java.util.Scanner;

public class Lec19_2DArray_searchMatrix {
    public static boolean searchMatrix(int[][] matrix, int key){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] == key) {
                    System.out.println("Key is at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){

        int[][] matrix = {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Key : ");
        int key = sc.nextInt();

        if (searchMatrix(matrix, key)){
            System.out.println("Key Founded Successfully");
        }
        else {
            System.out.println("Key not Found");
        }
    }
}
