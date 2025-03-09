class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int len = colors.length;
        int left = 0, right = 1, count = 0;

        while (right < len + k - 1) {  // Simulate circular array up to 2*n - 1
            if (colors[right % len] == colors[(right - 1) % len]) {
                left = right;  // Reset left pointer if alternation breaks
            }


            if (right - left + 1 == k) {  // Valid alternating window of size k
                count++;
                left++;  // Shrink window to move forward
            }
            
            right++;  // Expand window
        }

        return count;
    }
}
