class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        int pos = 0,neg = 1;
        for (int i = 0; i < n; i++) {
            if(nums[i] < 0){
                result[neg] = nums[i];
                neg+=2;
            }
            else{
                result[pos] = nums[i];
                pos+=2;
            }
        }
    return result;
    }
}