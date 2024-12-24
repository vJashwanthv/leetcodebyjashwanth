class Solution {
    public void reverse(int nums[],int i,int j){
        if(i != j){
        while(j>i){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n > 1 && k!=n){
            reverse(nums,0,n-1);
            reverse(nums,0,(k%n)-1);
            reverse(nums,(k%n),n-1);
        }
    }
}