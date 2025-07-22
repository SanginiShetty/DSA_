import java.util.*;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i< 5; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        for(int i = 0; i<5;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
