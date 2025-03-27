class Solution {
    public boolean isPalindrome(int x) {
        // If the number is negative, it's not a palindrome.
        if (x < 0) return false;
        
        String a = Integer.toString(x);
        StringBuilder b = new StringBuilder();
        
        // Reverse the string using StringBuilder
        for (int i = a.length() - 1; i >= 0; i--) {
            b.append(a.charAt(i));
        }
        
        // Compare original string with the reversed string
        return a.equals(b.toString());
    }
}
