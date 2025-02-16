
import java.util.Scanner;

public class Recursion5 {
    static int n;
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        sc.close();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n){
        if(n<=1)
        return n;

        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);

        return last + slast ;

    }
    
}
