class Solution {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<StringBuilder> string = new Stack<>();
        int n=0;
        StringBuilder ans=new StringBuilder();

        for(char ch: s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                n=n*10+(ch-'0');
            }

            else if(ch=='[')
            {
                count.push(n);
                string.push(ans);

                n=0;
                ans=new StringBuilder();
            }

            else if(ch==']')
            {
                int r=count.pop();
                StringBuilder repeat = new StringBuilder();
                repeat=string.pop();

                for(int i=0;i<r;i++)
                {
                    repeat.append(ans);
                }

                ans=repeat;
            }

            else
            {
                ans.append(ch);
            }
        }
        return ans.toString();
        
    }
}
