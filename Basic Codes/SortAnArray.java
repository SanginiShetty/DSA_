import java.util.Arrays;
public class SortAnArray {

    public static void main(String args[]) {
        // String str[] = {"bmw", "audi", "toyota", "hyundai"};
        // Arrays.sort(str);
        // for(String i: str){
        //     System.out.println(i);
        // }

        int arr[] = {3,5,6,4,5,5,8,7,6,7};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
