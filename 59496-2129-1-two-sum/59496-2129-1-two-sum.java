class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(hm.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = hm.get(target - nums[i]);
            }
            hm.put(nums[i],i);
        }
        return result;
    }
}