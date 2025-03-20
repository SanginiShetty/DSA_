public class ZeroOneTriangle {
    public static void main(String args[]) {
        int n=5;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                //1
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                //0
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

// consider a matrix so you can add up the index that is I and J 
// if even I+J then we will get 1
// else odd I+J then we will get 0