class Solution {
    public int missingNumber(int[] nums) {
        int total=0;
        for(int i=0; i<=nums.length; i++)
        {
            total+=i;//it will count the length  according that it will subtract the ele with total then we will get the missing ele 
        }
        for(int i:nums)
        {
            total-=i;
        }
        return total;
    }
}