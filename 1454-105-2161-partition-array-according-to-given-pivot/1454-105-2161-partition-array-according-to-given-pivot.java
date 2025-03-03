class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int lessi = 0;
        int greati = nums.length-1;
        for(int i = 0,j = nums.length-1; i < nums.length; i++,j--){
            if(nums[i] < pivot){
                ans[lessi] = nums[i];
                lessi++;
            }
            if(nums[j] > pivot){
                ans[greati] = nums[j];
                greati--;
            }
        }
        while(lessi <= greati){
            ans[lessi] = pivot;
            lessi++;
        }
        return ans;
    }
}