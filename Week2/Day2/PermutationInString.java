import java.util.*;
class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s2.length()<s1.length())
        {
            return false;
        }
       
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        int ls1=s1.length();

        for(int i=0;i<ls1;i++)
        {
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2))
        {
            return true;
        }

        for(int i=ls1;i<s2.length();i++)
        {
            freq2[s2.charAt(i)-'a']++;
            freq2[s2.charAt(i-ls1)-'a']--;

            if(Arrays.equals(freq1,freq2))
           {
            return true;
           }
        }
        return false;     
    }
}
