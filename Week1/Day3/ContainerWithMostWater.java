class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int max_area=0;
        int left=0;
        int right=height.length - 1;

        while(left<=right)
        {
            area=Math.min(height[left],height[right])*(right-left);
            max_area=Math.max(max_area,area);

            if(height[left]>height[right])
            {
                right--;
            }
            else
            {
                left++;
            }    
        }
        return max_area;
    }
}
