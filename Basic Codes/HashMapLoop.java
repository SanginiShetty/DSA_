
import java.util.HashMap;

public class HashMapLoop {
    public static void main(String args[]){
        HashMap<String,String> str= new HashMap<String,String>();
        str.put("Maharashtra", "Mumbai");
        str.put("Delhi","Delhi");
        str.put("Karnataka", "Bengaluru");
        for(String i:str.keySet()){
            System.out.println(i);
        }
        for(String i:str.values()){
            System.out.println(i);
        }
    }
}
