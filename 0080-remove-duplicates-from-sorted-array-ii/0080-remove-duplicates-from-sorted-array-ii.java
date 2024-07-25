class Solution {
    public int removeDuplicates(int[] nums) {
        int numsSize = nums.length;
        int[] duplicateNums = new int[numsSize];

        int before = nums[0];
        int duplicateCount = 0;
        int duplicateIndex = 0;
        
        if (numsSize > 1) {
            for (int i = 0; i < numsSize; i++) {
                if (i == numsSize - 1) {
                    if (duplicateCount < 2 && before >= nums[i-1]) {
                        duplicateNums[duplicateIndex] = before;
                        duplicateIndex++;
                    }
                    break;
                }

                int next = nums[i+1];

                if (before == next) {
                    if (duplicateCount < 2) {
                        duplicateCount++;
                        duplicateNums[duplicateIndex] = before;
                        duplicateIndex++;
                    } else {
                        duplicateCount++;
                    }
                } else {
                    if (duplicateCount < 2) {
                        duplicateNums[duplicateIndex] = before;
                        duplicateIndex++;
                    }
                    duplicateCount = 0;
                }
                before = nums[i+1];
            }
            
            for (int i = 0; i < duplicateIndex; i++) {
                nums[i] = duplicateNums[i];
            }
        } else {
            duplicateIndex = numsSize;
        }

        return duplicateIndex;
    }
}