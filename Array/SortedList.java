
import java.util.*;

public class SortedList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < 5; i++) {
            if (arr[i] > arr[i - 1]) {

            } else {
                System.out.println("array not sorted");
                System.exit(0);
            }

        }
        System.out.println("array is sorted");
    }
}
