import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     int a=0;
     for(int i=m;i<nums1.length;i++)
     {
        nums1[i]=nums2[a];
        a++;
     }
        Arrays.sort(nums1);
    }
}