class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        int start = nums[0];
        int last = nums[nums.length - 1];

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i + 1] - nums[i] > 1) {
                return nums[i] + 1;
            }
        }

         
        if (start != 0) {
            return 0;
        }

        return last + 1;
    }
}