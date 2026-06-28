class Solution {
    public String longestPalindrome(String s) {
        
       int start=0; 
       int maxlen=0;
       
       for(int i=0;i<s.length();i++){
        int mid=i;

        int l1=mid;
        int r1=mid;
        while(l1>=0 && r1<s.length() && s.charAt(l1)==s.charAt(r1))
        {
            l1--;
            r1++;
        }
        int len1=r1-l1-1;
        if(maxlen<len1){
            maxlen=len1;
            start=l1+1;}

        int l2=mid;
        int r2=mid+1;
        while(l2>=0 && r2<s.length() && s.charAt(l2)==s.charAt(r2))
        {
            l2--;
            r2++;
        }
        int len2=r2-l2-1;
        if(maxlen<len2){
            maxlen=len2;
            start=l2+1;}

        }
    
    return s.substring(start,start+maxlen);
    }
}
