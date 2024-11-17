class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int freq = 0;
        for (int i = 0; i < n; i++) {
            if (freq == 0) {
                ans = nums[i];
            }
            if (nums[i] == ans) {
                freq++;
            }
            else{
                freq--;
            }
        }
        if(freq == 0){
            return -1;
        }
        return ans;
    }
}