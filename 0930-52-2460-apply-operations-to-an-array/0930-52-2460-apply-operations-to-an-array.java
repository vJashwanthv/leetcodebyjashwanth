class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Apply the operations
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Shift all zeros to the end
        int[] res = new int[n];
        int index = 0;

        // Collect non-zero elements first
        for (int num : nums) {
            if (num != 0) {
                res[index++] = num;
            }
        }

        return res;
    }
}
