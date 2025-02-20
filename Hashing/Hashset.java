

//HashSet in java
//                        | Array | Sorted Array |   BST   |
//Insert/Add - O(1)         O(n)       O(n)         O(h) O(n) 
//Search/Contains- O(1)     O(n)      O(logn)       O(h) O(n) O(log n)
//Delete/Remove - O(1)      O(n)       O(n)         O(h) O(n) 

//HashSet store only unique values

import java.util.HashSet;
import java.util.Iterator;
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
        System.out.println(set);

        // //Search - contains
        // if(set.contains(1)) {
        //     System.out.println("Set contains 1");
        // }
        // if(!set.contains(8)) {
        //     System.out.println("Does not contain 8");
        // }
        
        //Delete
        // set.remove(1);
        // System.out.println(set);
        // if(!set.contains(1)){
        //     System.out.println("does not contain 1 - removed");
        // }

        //Iterator ----> before iterating it point to null 
        //it.hasNext()-->true/false
        Iterator it = set.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
    
}
