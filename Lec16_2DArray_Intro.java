import java.util.Scanner;

public class Lec16_2DArray_Intro {
    public static boolean Search(int[][] matrix, int key){
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (matrix[i][j] == key){
                    System.out.println("Found at (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not Found !!!");
        return false;
    }
    public static void main(String[] args){

        int[][] matrix = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Output
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter a Key : ");
        int key = sc.nextInt();
        Search(matrix,key);
    }
}
