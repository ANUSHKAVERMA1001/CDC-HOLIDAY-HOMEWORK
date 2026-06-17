class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left=0;
        int max_len=0;
        int l=0;

        for(int right=0;right<s.length();right++)
        {
            while(set.contains(s.charAt(right)))
            {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            l=right-left+1;
            max_len=Math.max(l,max_len);
        }
        return max_len;
        
    }
}
