class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==1) return nums[0];

        int skipFirst[] = new int[n-1];
        int skipLast[] = new int[n-1];
        for(int i=0; i<n-1; i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        }
        int res1 = robHelper(skipFirst);
        int res2 = robHelper(skipLast);
        return Math.max(res1, res2);
    }
    public int robHelper(int arr[])
    {
     int n=arr.length;
        if(n==1) return arr[0];

        int dp[] = new int[n+1];//
        dp[0]=0;
        dp[1]=arr[0];
        for(int i=2; i<n+1; i++)
        {
            int steal = arr[i-1] +dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(steal, skip);
        }
        return dp[n];
    }
}

