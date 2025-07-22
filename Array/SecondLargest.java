import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i = 0; i< 5; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int secondlargest = -1;
        for(int i = 0; i<5;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest =arr[i];  
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest = arr[i];
            }

        }
        System.out.println(secondlargest);
    }
}