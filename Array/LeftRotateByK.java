public class LeftRotateByK {
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5,6,7,8};
        int k = 3;
        int n = nums.length;
        int temp[] = new int[k];
        //temp
        for(int i = 0; i<k; i++){
            temp[i] = nums[i];
        }
        //shift place by k
        for(int i = k; i< n; i++){
            nums[i-k] = nums[i];
        }

        //adding temp
        int j=0;
        for(int i = n-k; i<n;i++){
            nums[i] = temp[j];
            j++;
        }
        //print
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
