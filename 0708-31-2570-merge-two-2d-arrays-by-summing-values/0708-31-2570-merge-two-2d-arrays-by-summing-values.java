class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0,j = 0;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        while(i < len1 && j < len2){
            if(nums1[i][0] == nums2[j][0]){
                res.add(new ArrayList<>(Arrays.asList(nums1[i][0] , nums1[i][1] + nums2[j][1]) ) );
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                res.add(new ArrayList<>(Arrays.asList(nums1[i][0] , nums1[i][1]) ) );
                i++;
            }
            else{
                res.add(new ArrayList<>(Arrays.asList(nums2[j][0] , nums2[j][1]) ) );
                j++;
            }
        }

        while(i < len1){
            res.add(new ArrayList<>(Arrays.asList(nums1[i][0] , nums1[i][1]) ) );
            i++; 
        }

        while(j < len2){
            res.add(new ArrayList<>(Arrays.asList(nums2[j][0] , nums2[j][1]) ) );
            j++;  
        }

        int rows = res.size();
        int cols = res.get(0).size();
        int result[][] = new int[rows][cols];
        for(i = 0;i < rows;i++){
            for(j = 0;j < cols;j++){
                result[i][j] = res.get(i).get(j);
            }
        }

        return result;
    }
}