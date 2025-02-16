//Check whether the string is palindrome or not using fuctional recursion
import java.util.*;

public class Recursion4 {
    static String str;
    static int n;
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        n = str.length();
        sc.close();
        boolean result=isPalindrome(0, str, n);
        
    System.out.println("The string "+ str + " is "+ result);
    }
    static boolean isPalindrome (int i, String str, int n){
        if(i>=n/2){
        return true;
        }

        if( str.charAt(i) != str.charAt(n-1) ){
        return false;
        }

        return isPalindrome(i+1, str, n-1);
    }
}
