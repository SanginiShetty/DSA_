// // Print name n times

// import java.util.*;
// class Recursion2 {
//     static int n; 
//     static String name;
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name:");
//         name = sc.next();
//         System.out.println("Enter the number of times to be printed: ");
//         n = sc.nextInt();
//         sc.close();
//         print(1, n);
//     }
//     static void print(int cnt, int n) {
//         if(cnt > n)
//         return;          
//         System.out.println(name);
//         cnt++;
//         print(cnt, n);
        
//     }
// }

// class Recursion2{

//     static int cnt = 0;
//     static void print() {
//         if (cnt == 4) {
//             return;
//         }

//         System.out.println("Sangini");
//         cnt++;
//         print();
//     }

//     public static void main(String[] args) {
//         print();
//     }
// }





// //Print linearly from 1 to N
// import java.util.*;
// class Recursion2 {
//     static int num;
//     static int cnt = 1;

//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a positive integer:");
//         num = sc.nextInt();
//         sc.close();
//         print();
//     }

//     static void print(){
//         if(cnt > num)
//         return;
//         System.out.print(cnt +" ");
//         cnt++;
//         print();
//     }
// }





// //Print from N to 1   //5 4 3 2 1 
// import java.util.*;
// class Recursion2 {
//     static int num;
//     public static void main(String [] args){
//         Scanner sc = new Scanner (System.in);
//         System.out.println("Enter a positive number:");
//         num = sc.nextInt();
//         sc.close();
//         print();
//     }
//     static void print(){
//         int cnt = num;
//         if(cnt < 1)
//         return;

//         System.out.print(num + " ");
//         num--;
//         cnt--;
//         print();
//     }
// }







//1 to n using backtracing 

// import java.util.Scanner;

// public class Recursion2 {
//     static int n;
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         n = sc.nextInt();
//         sc.close();
//         func(n, n);
//     }
//     static void func(int i, int n){
//         if(i<1)
//         return;
//         func(i-1,n);
//         System.out.println(i);
//     }
// }






// //N to 1 Backtracing

// import java.util.Scanner;

// public class Recursion2 {
//     static int n;
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         n = sc.nextInt();
//         sc.close();
//         func(1, n);
//     }
//     static void func(int i, int n){
//         if(i>n)
//         return;
//         func(i+1,n);
//         System.out.println(i);
//     }
// }


//sum of 1 to n parameterized recursion

// import java.util.Scanner;

// public class Recursion2{
//     static int n;
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         n = sc.nextInt();
//         sc.close();
//         print(n, 0);
//     }
//     static void print(int i, int sum){
//         if(i<1){
//             System.out.println(sum);
//             return;
//         }
//         print(i-1, sum+i);
//     }
// }



//Sum of 1 to n functional recursion

import java.util.*;
public class Recursion2{
    static int n;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n= sc.nextInt();
        sc.close();
        System.out.println(func(n));
    }
    static int func(int n) {
        if(n==0){
            return 0;
        }
        return n + func(n-1);
    }
}