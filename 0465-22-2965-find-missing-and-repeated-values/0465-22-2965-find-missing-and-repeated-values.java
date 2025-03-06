class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] count = new int[n * n + 1]; // Tracking occurrences of numbers (1 to n*n)
        int repeating = -1, missing = -1;

        // Count occurrences of each number in the grid
        for (int[] row : grid) {
            for (int num : row) {
                count[num]++;
            }
        }

        // Find the repeating and missing numbers
        for (int i = 1; i <= n * n; i++) {
            if (count[i] == 2) repeating = i;
            if (count[i] == 0) missing = i;
            if (repeating != -1 && missing != -1) break; // Exit early when both are found
        }

        return new int[]{repeating, missing};
    }
}
