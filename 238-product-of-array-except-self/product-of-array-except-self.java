class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] result = new int[n];
        int left=1;
        int right=1;
        result[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            result[i]=result[i-1]*nums[i-1];
        }    
        for(int i=nums.length-2;i>=0;i--)
        {
            right *= nums[i + 1];
            result[i] *= right;
        }
        
        return result;
    }
}