class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Initialize two pointers
        int left = 0;
        int right = numbers.length - 1;
        
        // Iterate while left pointer is less than right pointer
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            
            // If the sum matches the target, return the indices (1-based)
            if (sum == target) {
                return new int[] { left + 1, right + 1 };  // +1 to convert to 1-based index
            }
            
            // If sum is less than the target, move the left pointer to the right
            if (sum < target) {
                left++;
            }
            // If sum is greater than the target, move the right pointer to the left
            else {
                right--;
            }
        }
        
        // If no solution is found (though the problem guarantees a solution), return an empty array
        return new int[] {};
    }
}
