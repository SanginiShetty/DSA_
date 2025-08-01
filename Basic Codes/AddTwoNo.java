import java.util.Scanner;

public class AddTwoNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Enter first number:");
        x = sc.nextInt();

        int y;
        System.out.println("Enter second number:");
        y = sc.nextInt();

        int sum = x+y;
        System.out.println("Sum = "+sum);
    }
}