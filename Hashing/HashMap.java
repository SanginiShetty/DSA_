//ApnaClg ks code from basic
//for key ---> exist (updates already existing value)
//        |
//        ---->doesnot exist (creates new key)

import java.util.*;
public class Hashmap{
    public static void main(String [] args) {
        //country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insertion
        map.put("India", 120);
        map.put("USA", 30);
        map.put("China", 150);

        System.out.println(map);
        
        map.put("China", 160);
        System.out.println(map);

        //.containsKey ---->key exists ----> true
        //.containsKey ---->key doesn't -----> false
        
        // if(map.containsKey("China")){
        //     System.out.println("Key is present");
        // }
        // else{
        //     System.out.println("Key is not present");
        // }

        // if(map.containsKey("Indonesia")){
        //     System.out.println("Key exists");
        // }
        // else{
        //     System.out.println("Key does not exist");
        // }

        // System.out.println(map.get("China"));//.get---->key exists ----> value
        // System.out.println(map.get("Indonesia"));//.get---->key doesn't exists ----> null


        // int arr[] ={ 12, 14, 16};

        // for(int i = 0; i<3; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        
        // //for(datatype val = arr)
        // for(int val : arr){
        //     System.out.print(val+" ");
        // }
        // System.out.println();

        // for(int val : arr)
        for(Map.Entry <String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " "+ map.get(key));
        }


        //remove
        map.remove("China");
        System.out.println(map);
    }
}





// import java.util.Scanner;
// import java.util.Map;
// import java.util.HashMap;

// public class HashMap {
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         Map<Integer, Integer> map =new HashMap<>();
//         System.out.println("Enter a length of the array:");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i = 0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         //pre-compute
        
//     }
// }





