class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs = new HashSet<>();
        int n = grid.length;
        int ans[] = new int[2];
        int sum = 0;
        int val = 0;

        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                val = grid[i][j];
                if(hs.contains(val)){
                    ans[0] = val;
                }
                else{
                    hs.add(val);
                    sum += val;
                }
            }
        }

        ans[1] = (n*n*(n*n + 1) )/ 2 - sum;

        return ans;
    }
}