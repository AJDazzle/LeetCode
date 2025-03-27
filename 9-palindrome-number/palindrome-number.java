import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++)
        {
            s.push(a.charAt(i));
        }
        String b="";
        while(!s.isEmpty())
        {
            b += s.pop();
        }
       return a.equals(b);
    }
}