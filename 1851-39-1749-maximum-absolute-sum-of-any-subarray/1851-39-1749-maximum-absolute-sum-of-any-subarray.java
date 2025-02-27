//Bruteforce
// class Solution {
//     public int maxAbsoluteSum(int[] nums) {
//         int n = nums.length;
//         int maxAbsSum = 0;
        
//         // Iterate over all possible subarrays
//         for (int i = 0; i < n; i++) {
//             int sum = 0; // Track subarray sum
//             for (int j = i; j < n; j++) {
//                 sum += nums[j]; // Compute sum of subarray [i, j]
//                 maxAbsSum = Math.max(maxAbsSum, Math.abs(sum));
//             }
//         }       
//         return maxAbsSum;
//     }
// }

//Modified Kadane's algorithm
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int cmax = 0,cmin = 0;
        int maxsum = 0,minsum = 0;
        for(int i : nums){
            cmax = Math.max(0,cmax+i);
            cmin = Math.min(0,cmin+i);
            maxsum = Math.max(maxsum,cmax);
            minsum = Math.min(minsum,cmin);
        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}
