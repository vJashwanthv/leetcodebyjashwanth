class Solution {
    public int maxAscendingSum(int[] nums) {
        int len = nums.length;
        if(len == 0){return 0;}
        int maxresult=0;
        int result=nums[0];
        for(int i=0;i<len-1;i++){
            if(nums[i]<nums[i+1]){
                result+=nums[i+1];
            }
            else{
                maxresult = Math.max(result,maxresult);
                result=nums[i+1];

            }
        }
        maxresult = Math.max(result,maxresult);
        return maxresult;
    }
}