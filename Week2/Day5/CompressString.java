class Solution {
    public int compress(char[] chars) {

        int write=0;
        int read=1;
        int count=1;
        for(read=1;read<chars.length +1;read++)
        {
            if(read==chars.length || chars[read]!=chars[read-1])
            {
                chars[write]=chars[read-1];
                if(count>1)
                {
                    String s=Integer.toString(count);
                    for(char ch: s.toCharArray())
                    {
                    write++;
                    chars[write]=ch;
                    }
                }
                write++;
                count=1;
            }
            else
            {
                count++;
            }
        }

        return write;
        
    }
}
