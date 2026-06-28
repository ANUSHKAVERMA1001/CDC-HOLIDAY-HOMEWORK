class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        
        HashMap<String,List<String>> map=new HashMap<>();

        for(String s : strs)
        {
            int [] freq = new int[26];
            for(char ch: s.toCharArray())
            {
                freq[ch-'a']++;
            }

            StringBuilder sk = new StringBuilder();
            for(int i=0 ; i<26;i++)
            {
                sk.append("#");
                sk.append(freq[i]);
            }
            
            String key = sk.toString();
            if(!map.containsKey(key))
            {
                List<String> str=new ArrayList<>();
                str.add(s);
                map.put(key,str);
            }
            else
            {
                map.get(key).add(s); //list.add(string)
            }
        }

        return (new ArrayList<> (map.values()));

    }
}
