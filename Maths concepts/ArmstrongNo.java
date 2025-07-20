import java.util.*;
public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        checkMainFormula(num);
    }
    public static void checkMainFormula(int num) {
        int n=num;
        int lastdigit;
        int sum=0;
        while(n!=0){
            lastdigit = n%10;
            sum = sum + (lastdigit * lastdigit * lastdigit);
            n = n/10;
        }
        if(num == sum){
            System.out.println(num+ " is an armstrrong number");
        }
        else{
            System.out.println(num+ " is not an armstrong number");
        }
    }
}
