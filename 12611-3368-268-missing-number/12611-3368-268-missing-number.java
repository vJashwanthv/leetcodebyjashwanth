class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0;
        int xor2 = 0;
        for(int i=1;i<=n;i++){
            xor1 ^= i;
        }
        for(int i : nums){
            xor2 ^= i;
        }
        return xor1^xor2;
    }
}