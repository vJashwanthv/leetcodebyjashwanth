class Solution {
    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;

        if(n>1){
            int j=-1;
            for(int i=0;i<n;i++){
                if(nums[i] == 0){
                    j=i;
                    break;
                }
            }
            if(j != -1){
                for(int i=j+1;i<n;i++){
                if(nums[i] != 0){
                    swap(nums,i,j);
                    j++;
                }
            }
            }
        }
    }
}