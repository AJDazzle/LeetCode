class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false; // Negative numbers can't be palindromes
        String a = Integer.toString(x);
        
        int left = 0;
        int right = a.length() - 1;
        
        // Compare characters from both ends
        while (left < right) {
            if (a.charAt(left) != a.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
