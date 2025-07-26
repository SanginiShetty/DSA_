public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {7,98,6,8,85,2,1,3,86};
        int target = 1;
        for(int i =0 ; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("Found at " + (i+1));
                System.exit(0);
            }
        }
        System.out.println("Not found");
    }
}
