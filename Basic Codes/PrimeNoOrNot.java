
import java.util.Scanner;

public class PrimeNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int flag = 0;
        for(int i=2; i<num/2; i++){
            if(num%i == 0){
                flag++;
            }
        }
        if(flag>2){
            System.out.println("Not a prime number");
        }
        else{
            System.out.println("Prime number");
        }
    }
}
