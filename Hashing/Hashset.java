
import java.util.HashSet;

//HashSet in java
//                        | Array | Sorted Array |   BST   |
//Insert/Add - O(1)         O(n)       O(n)         O(h) O(n) 
//Search/Contains- O(1)     O(n)      O(logn)       O(h) O(n) O(log n)
//Delete/Remove - O(1)      O(n)       O(n)         O(h) O(n) 

//HashSet store only unique values
public class Hashset {
    public static void main(String args[])
    {
        //creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list =  new ArrayList<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //list.add(el);
        
        //Size
        System.out.println("Sixe of set is: "+set.size());

        //Search - contains
        if(set.contains(1)) {
            System.out.println("Set contains 1");
        }
        if(!set.contains(8)) {
            System.out.println("Does not contain 8");
        }
        
        //Delete
        set.remove(1);
        System.out.println(set);
        if(!set.contains(1)){
            System.out.println("does not contain 1 - removed");
        }

    }
    
}
