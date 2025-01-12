class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int result[][] = new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<matrix[i].length;j++){
                result[j][len-1-i] = matrix[i][j];
            }
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j] = result[i][j];
            }
        }
    }
}