class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsum = nums[0];
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(sum < 0){
                sum = 0;
            }
            sum+=nums[i];
            maxsum = Math.max(sum,maxsum);
        }
        return maxsum;
    }
}