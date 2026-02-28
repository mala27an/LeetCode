class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int res=0; // area can not be -ve 

        while(left<right){
            int width=right-left;
            int r=Math.min(height[left], height[right])*(right-left);

            res=Math.max(res,r);

            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return res;
    }
}