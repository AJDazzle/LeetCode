class Solution {
    public String longestCommonPrefix(String[] strs) {
        // If there are no strings, the result is an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Start by assuming the entire first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with each string in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep reducing the prefix until it matches the start of the current string
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
