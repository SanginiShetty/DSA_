public class DiamondPattern {
    public static void main(String[] args) {
        int n=4;
        //1st half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //1st half of the diamond
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            //2nd half of the diamond
            for(int j=2; j<=i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //3rd half of the diamond
            for(int j=i; j>=1;j--) {
                System.out.print("*");
            }

            //4th half of the diamond 
            for(int j=i-1; j>=1; j--) {
                System.out.print("*");
            }

            System.out.println();

        }

                // //1st half
                // for(int i=1; i<=n; i++) {
                //     //spaces
                //     for(int j=1; j<=n-i; j++) {
                //         System.out.print(" ");
                //     }
        
                //     //1st half of the diamond
                //     for(int j=1; j<=2*i-1; j++) {
                //         System.out.print("*");
                //     }
        
                //     System.out.println();
                // }
        
                // //2nd half
                // for(int i=n; i>=1; i--) {
                //     //spaces
                //     for(int j=1; j<=n-i; j++) {
                //         System.out.print(" ");
                //     }
        
                //     //2nd half of the diamond
                //     for(int j=1; j<=2*i-1;j++) {
                //         System.out.print("*");
                //     }
        
                //     System.out.println();
        


    }
}
