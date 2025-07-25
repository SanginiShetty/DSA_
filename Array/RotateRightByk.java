public class RotateRightByk {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int n = nums.length;
        int k = 3;
        k = k%n;
        int temp[] = new int[k];
        //temp
        int j=0;
        for(int i=n-k; i<n; i++){
            temp[j] = nums[i];
            j++;
        }
        //shifting
        for(int i=n-1; i>k-1; i--){
            nums[i]=nums[i-k];
        }
        //adding temp into the original array
        for(int i=0; i<k; i++){
            nums[i] = temp[i];
        }
        for(int i =0; i<n ;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
