class Solution {
    public int minimumRecolors(String blocks, int k) {
        int len = blocks.length();
        int minOps = k;
        int wCount = 0;

        // Count 'W's in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') wCount++;
        }

        minOps = wCount; // Initialize minOps to the first window's white count

        // Sliding window approach
        for (int i = k; i < len; i++) {
            if (blocks.charAt(i - k) == 'W') wCount--; // Remove leftmost block from window
            if (blocks.charAt(i) == 'W') wCount++; // Add new rightmost block

            minOps = Math.min(minOps, wCount); // Track minimum white count in any window
        }

        return minOps;
    }
}
