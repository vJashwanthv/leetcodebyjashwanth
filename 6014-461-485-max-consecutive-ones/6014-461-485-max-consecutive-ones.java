class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ct = 0;
        int maxct = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                maxct = Math.max(maxct,ct);
                ct = 0;
            }
            else{
                ct += 1;
            }
        }
        maxct = Math.max(maxct, ct);
        return maxct;
    }
}