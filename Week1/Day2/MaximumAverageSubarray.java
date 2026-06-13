class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum_n=0;

        for(int i=0;i<k;i++)
        {
            sum_n+=nums[i];
        }

        int max_sum=sum_n;

        for(int i=k;i<nums.length;i++)
        {
            sum_n=sum_n+nums[i]-nums[i-k];
            max_sum=Math.max(sum_n,max_sum);
        }
        return (double) max_sum/k;
    }
}
