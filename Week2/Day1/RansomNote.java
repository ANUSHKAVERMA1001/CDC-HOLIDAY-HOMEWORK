class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int[] freq1= new int[26];
        
        for(char ch:magazine.toCharArray())
        {
            freq1[ch-'a']++;
        }

        for(char ch: ransomNote.toCharArray())
        {
            freq1[ch-'a']--;
            if(freq1[ch-'a']<0)
            {
                return false;
            }
        }
        return true;

        
    }
}
