class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength=1;
        int currentLength=1;
        if(nums.length==0)
            return 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]>nums[i-1])
                currentLength++;
            else
                currentLength=1;
                
            if(currentLength>maxLength)
                maxLength=currentLength;
        }
        return maxLength;
    }
}