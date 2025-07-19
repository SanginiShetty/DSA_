import java.util.*;
public class PalindromeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPalindrome(num);
    }
    public static void isPalindrome(int num){
        int n = num;
        int reverseno = 0;
        int lastdigit;
        while(n!=0) {
            lastdigit = n%10;
            reverseno = reverseno*10 + lastdigit;
            n = n/10;
        }
        if(num == reverseno){
            System.out.println(num +" is Palindrome");
        }
        else{
            System.out.println(num+" is not palindrome");
        }
    }
}
