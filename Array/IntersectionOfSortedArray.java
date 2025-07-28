import java.util.ArrayList;

public class IntersectionOfSortedArray {
    public static void main(String[] args) {
        int nums1[] = {1,2,1,3,4,5,5,6,6,7,8,9};
        int nums2[] = {1,2,3,3,4,5,5,6};
        int n1 = nums1.length;
        int n2= nums2.length;
        ArrayList<Integer>ans = new ArrayList<>();
        // int visited[] = new int[n2];
        // for(int i=0; i<n1; i++){
        //     for(int j=0; j<n2; j++){
        //         if(nums1[i] == nums2[j] && visited[j]==0){
        //             ans.add(nums1[i]);
        //             visited[j] = 1;
        //             break;
        //         }
        //         if(nums2[j] > nums1[i]) break;
        //     }
        // }
        // System.out.println(ans);//brute force

        //optimal solution
        int i=0, j=0;
        while(i<n1 && j<n2){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ans.add(nums1[i]);
                i++;
                j++;
            }
        }
        System.out.println(ans);
    }
}
