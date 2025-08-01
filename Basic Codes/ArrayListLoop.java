import java.util.ArrayList;
public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Volvo");
        arr.add("BMW");
        arr.add("Maruti");
        arr.add("Bugati");

        for(String i:arr){
            System.out.println(i);
        }
    }
}
