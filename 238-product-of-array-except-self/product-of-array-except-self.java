class Solution {
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
        int[] result = new int[n];
        
        // Step 1: Compute the left product for each index
        result[0] = 1;  // There are no elements to the left of the first element
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        
        // Step 2: Compute the right product and multiply it with the result array
        int rightProduct = 1;  // There are no elements to the right of the last element
        for (int i = n - 2; i >= 0; i--) {
            rightProduct *= nums[i + 1];
            result[i] *= rightProduct;
        }
        
        return result;
    }
}