class Solution {
    public int[] leftRightDifference(int[] nums) {
        int result[]=new int[nums.length];
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=0;
        for(int i=1;i<nums.length;i++)
        {
            left[i]=left[i-1]+nums[i-1];
        }
        right[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--)
        {
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++)
        {
            result[i]=left[i]-right[i];
            if(result[i]<0)
            {
                result[i]*=-1;
            }
        }
        return result;
    }
}