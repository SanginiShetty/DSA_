// Print name 5 times

// import java.util.*;
// class Recursion2 {
//     static int cnt = 0;
//     static String name;
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter name:");
//         name = sc.next();
//         sc.close();
//         print();
//     }
//     static void print() {
//         if(cnt == 5)
//         return;          
//         System.out.println(name);
//         cnt++;
//         print();
        
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