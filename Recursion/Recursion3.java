//REVERSE ARRAY USING RECURSION

import java.util.*;

public class Recursion3 {

    static int n;
    static int arr[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        n = sc.nextInt();

        arr = new int[n];

        System.out.println("Enter an array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        reverse(0, arr, n);
        System.out.println("Reversed array" + Arrays.toString(arr));
    }

    static void reverse(int i, int arr[], int n) {

        if (i >= n / 2) {
            // System.out.println("Reversed array");
            // for (int j = 0; j < n; j++) {
            //     System.out.print(arr[j]);
            // }
            return;
        }

        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        reverse(i + 1, arr, n);
    }
}


//Arrays.toString(arr)