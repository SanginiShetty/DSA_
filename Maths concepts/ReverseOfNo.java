
import java.util.*;

public class ReverseOfNo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reverse(num);
    }

    public static void reverse(int num) {
        while(num!=0){
            System.out.print(num%10);
            num = num/10;
        }
    }
}
