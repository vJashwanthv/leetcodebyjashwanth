class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n = grid.length;
        long S = 0, S2 = 0;

        // Compute sum (S) and sum of squares (S2)
        for (int[] row : grid) {
            for (int num : row) {
                S += (long)num;
                S2 += (long)num * (long)num;
            }
        }

        // Expected sum and sum of squares for numbers 1 to n*n
        long SN = (n * n * (n * n + 1)) / 2;
        long S2N = (n * n * (n * n + 1) * (2 * n * n + 1)) / 6;

        // Compute the difference equations
        long val1 = S - SN;  // X - Y
        long val2 = S2 - S2N; // X^2 - Y^2

        val2 /= val1; // (X + Y)

        long X = (val1 + val2) / 2; // Repeating number
        long Y = X - val1; // Missing number

        return new int[]{(int)X, (int)Y};
    }
}
