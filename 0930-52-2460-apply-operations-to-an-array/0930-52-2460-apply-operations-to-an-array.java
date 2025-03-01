class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Apply operations (merge adjacent equal numbers)
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // Step 2: Shift non-zero elements forward (in-place)
        int pos = 0; // Pointer for placing non-zero values

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                // Swap only if i and pos are different
                if (i != pos) {
                    int temp = nums[i];
                    nums[i] = nums[pos];
                    nums[pos] = temp;
                }
                pos++; // Move to the next position for a non-zero element
            }
        }

        return nums;
    }
}
