class Solution {
    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int res = nums[i] + nums[j];
                if (res == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};  
    }
}