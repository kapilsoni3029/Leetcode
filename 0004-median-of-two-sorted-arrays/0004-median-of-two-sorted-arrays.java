import java.util.*;
class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double arr[]=new double[nums1.length+nums2.length];
        int n=arr.length;
        int k=0;
        for(int i=0;i<nums1.length;i++){
            arr[k++]=nums1[i];
            
        }for(int j=0;j<nums2.length;j++){
            arr[k++]=nums2[j];
        }
        Arrays.sort(arr);
        if(n%2==0){
            return (arr[(n/2)-1]+arr[n/2])/2.0;
        }else{
            return (double)arr[n/2];
        }
    }
    public static void main(String args[]){
        int nums1[]={1,3};
        int nums2[]={2};
        System.out.print(findMedianSortedArrays(nums1,nums2));

    }
}