// //number hashing
// import java.util.*;

// public class Hashing {
//     //int arr new[1e7] ---> if declared globally for integer
//     public static void main(String [] args) {
//         int n, q;  //length //query
//         int arr[];
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         n = sc.nextInt();
//         arr = new int[n];  //array initialization
//         System.out.println("Enter the elements of the array:");
//         for(int i= 0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         //precompute
//         int [] hash = new int[10^7];  //14 error array size out of bound  [0,1,2,3,,4,5,6,...,12] //new int[1e6]  --> inside main if more it will show segmentation fault
//         for(int i = 0; i<n; i++){
//             hash[arr[i]] += 1;
//         }
        
//         //query
//         System.out.println("Enter the number of query");
//         q = sc.nextInt();

//         while(q > 0) {
//             int num;
//             System.out.println("Enter your query:");
//             num = sc.nextInt();
//             //fetch
//             System.out.println("The number of "+ num + " present are:" + hash[num]);
//             q--;
//         }
//         sc.close();

//     }
// }


// //input text
// // 5
// // 1 3 2 1 3
// // 5
// // 1
// // 4
// // 2
// // 3
// // 12



// number hashing---> using array
// character hashing----> 