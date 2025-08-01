
import java.util.Arrays;


public class SortAnArray {

    public static void main(String args[]) {
        String str[] = {"bmw", "audi", "toyota", "hyundai"};
        Arrays.sort(str);
        for(String i: str){
            System.out.println(i);
        }
    }
}
