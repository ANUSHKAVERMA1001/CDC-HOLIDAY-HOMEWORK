class Solution {
    public List<Integer> findAnagrams(String s, String p) {

       List<Integer> l=new ArrayList <>();
        if(p.length()>s.length())
        {
            return l;
        }

        int[] freqp=new int[26];
        int[] freqs=new int[26];
        int plen=p.length();

        for(int i=0;i<plen;i++)
        {
            freqp[p.charAt(i)-'a']++;
            freqs[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freqp,freqs))
        {
            l.add(0);
        }

        for(int i=plen;i<s.length();i++)
        {
            freqs[s.charAt(i)-'a']++;
            freqs[s.charAt(i-plen)-'a']--;

            if(Arrays.equals(freqp,freqs))
        {
            l.add(i-plen+1);
        }

        }
        return l;
        
    }
}
