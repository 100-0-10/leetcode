class Solution {
    public int removeDuplicates(int[] nums) {
        boolean[] hasNums = new boolean[201];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hasNums[nums[i]+100]) {
                nums[i] = 101;
            } else {
                hasNums[nums[i]+100] = true;
                k++;
            }
        }

        Arrays.sort(nums);
        return k;
    }
}