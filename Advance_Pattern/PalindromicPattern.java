public class PalindromicPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=5; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //1st half num
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }

            //2nd half num
            for(int j=2; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
