import java.util.Scanner;

public class Lec22_String_Palindrome {
//    public static void isPalindrome(String str){
//        StringBuilder str2 = new StringBuilder();
//        for (int i = str.length()-1; i >= 0; i--){
//            str2.append(str.charAt(i));
//        }
//
//        if (str.contentEquals(str2)){
//            System.out.println("Is Palindrome");
//        }
//        else {
//            System.out.println("Is not Palindrome");
//        }
//    }

    public static boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++){
            int n = str.length();
            if (str.charAt(i) != str.charAt(n-1-i)){
                //not a palindrome
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Word - ");
        String str = sc.next();

        System.out.println(isPalindrome(str));
    }
}
