public class FindSmallestElement {
    public static void main(String args[]){
        int arr[] = {3,2,6,4,9,4,2,9,0,6,8};
        int smallest = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("Smallest element="+smallest);
    }
}
