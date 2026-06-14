class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        int pos=n-1;
        int [] ans= new int[n] ;
        while(left<=right)
        {
            if((nums[left]*nums[left])>(nums[right]*nums[right]))
            {
                ans[pos]=(nums[left]*nums[left]);
                left++;
                pos--;
            }
            else
            {
                ans[pos]=(nums[right]*nums[right]);
                right--;
                pos--;
            }
        }
        return ans;
    }
}
