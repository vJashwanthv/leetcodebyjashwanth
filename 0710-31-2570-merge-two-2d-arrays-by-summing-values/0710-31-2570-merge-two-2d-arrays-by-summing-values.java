class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int i = 0,j = 0;
        ArrayList<int[]> res = new ArrayList<int[]>();

        while(i < len1 && j < len2){
            if(nums1[i][0] == nums2[j][0]){
                res.add(new int[]{ nums1[i][0] , nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if(nums1[i][0] < nums2[j][0]){
                res.add(nums1[i++]);
            }
            else{
                res.add(nums2[j++]);
            }
        }

        while(i < len1){
            res.add(nums1[i++]);
        }

        while(j < len2){
            res.add(nums2[j++]);
        }

        return res.toArray(new int[res.size()][]);
    }
}