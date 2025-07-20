import java.util.*;
public class PrintAllDivisor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        calculate(num);
    }
    public static void calculate(int num){
        // for(int i=1; i<=num; i++){
        //     if(num%i == 0){
        //         System.out.print(i+ " ");
        //     }
        // }
        for(int i = 1; i<= Math.sqrt(num); i++){
            if(num%i==0){
                System.out.print(i+ " ");
                if(num/i!=i){
                    System.out.print(num/i+" ");
                }
            }

        }
    }
}