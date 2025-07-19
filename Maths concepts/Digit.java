import java.util.*;
public class Digit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        printDigit(num);
    }
    public static void printDigit(int n){
        int number = n;
        while(number!=0){
            System.out.println(number%10);
            number = number/10;
        }
    }
}
