class Solution {
    public boolean isPalindrome(String s) {
        // Remove all non-alphanumeric characters and convert to lowercase
        StringBuilder cleanedString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleanedString.append(Character.toLowerCase(c));
            }
        }

        // Convert StringBuilder to string for easier manipulation
        String normalizedString = cleanedString.toString();

        // Check if the string is a palindrome
        int left = 0, right = normalizedString.length() - 1;
        while (left < right) {
            if (normalizedString.charAt(left) != normalizedString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true; 
    }
}