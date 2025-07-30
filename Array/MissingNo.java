public class MissingNo {
    public static void main(String args[]){
        int arr[] = {1,2,4,5,6};
        for(int i=0; i<arr.length; i++){
            if((i+1)!=arr[i]){
               System.out.println((i+1) + " is missing");
               System.exit(0);
            }
        }
    }
}
