import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        Boolean a= true;
        HashMap<Character,Integer> h=new HashMap<>();
        if(s.length()<=t.length())
        {
            for(int i=0;i<s.length();i++)
        {
            if(!h.containsKey(s.charAt(i)))
            {
                h.put(s.charAt(i),1);
            }
            else
            {
                h.put(s.charAt(i),h.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(h.containsKey(t.charAt(i)) && h.get(t.charAt(i))>0)
            {
                 h.put(t.charAt(i),h.get(t.charAt(i))-1);
            }
            else
            {
                return a=false;
            }
        }
        }
        else
        {
        return a=false;
        }
        return a;
    }
}