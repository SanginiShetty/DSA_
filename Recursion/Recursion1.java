class Recursion1{

    static int cnt = 0;
    static void print() {
        if (cnt == 4) {
            return;
        }

        System.out.println(cnt);
        cnt++;
        print();
    }

    public static void main(String[] args) {
        print();
    }
}

// class Recursion1{

//     static int cnt = 0;
//     static void print() {
//         if (cnt == 4) {
//             return;
//         }

//         System.out.println(cnt);
//         cnt++;
//         print();
//     }
// }
//     public class Main {
//     public static void main(String[] args) {
//         Recursion1.print();
//     }
// }

