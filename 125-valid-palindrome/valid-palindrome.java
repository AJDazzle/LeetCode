class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]","");
        a=a.toLowerCase();
        int left=0;
        int right=a.length()-1;
        for(int i=0;i<a.length()/2;i++)
        {
            if(a.charAt(left)==a.charAt(right))
            {
                left++;
                right--;
            }
            else
            {
                return false;
            }
        }
     return true;   
    }
}