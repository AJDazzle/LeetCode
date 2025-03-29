import java.util.*;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int result[]=new int[k];
        int index=0;
        HashMap<Integer,Integer> h= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!h.containsKey(nums[i]))
            {
                h.put(nums[i],1);
            }
            else
            {
                h.put(nums[i],h.get(nums[i])+1);
            }
        }
        
        for(int i=0;i<k;i++)
        {
            int max=0;
            int f=0;
            for(Map.Entry<Integer,Integer> entry : h.entrySet())
            {
                if(entry.getValue()>max)
                {
                    max=entry.getValue();
                    f=entry.getKey();
                }
            }
            result[index]=f;
            index++;
            h.put(f,0);
        }
            return result;
    }
}