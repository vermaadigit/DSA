import java.util.Scanner;

public class Lec24_String_subString {
    public static void subString(String str, int si, int ei){
        //String word = "";
        StringBuilder word = new StringBuilder();

        for (int i = si; i <= ei; i++){
            word.append(str.charAt(i));
        }

        System.out.println("Your Sub-String is " + word);
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Word - ");
        String str = sc.next();

        System.out.print("Enter Starting Index - ");
        int si = sc.nextInt();

        System.out.print("Enter Ending Index - ");
        int ei = sc.nextInt();

        subString(str,si,ei);
    }
}
