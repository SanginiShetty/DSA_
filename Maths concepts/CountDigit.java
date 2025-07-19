import java.util.*;

public class CountDigit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        countTheDigitNumber(num);
    }
    public static void countTheDigitNumber(int num){
        int n = num;
        int cnt = 0;
        while(n!=0){
            cnt++;
            n = n/10;
        }
        System.out.println(cnt);
    }
}
