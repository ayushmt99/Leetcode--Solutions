class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int newCL = -1;
        for (int i = 0; i < rowLength; i++) {
            if(matrix[i][columnLength-1]==target){
                    return true;
                }
                if(matrix[i][columnLength-1]>target){
                    newCL = i;
                    break;
                }
        }
        if(newCL==-1){
            return false;
        }
        for (int i = 0; i < columnLength; i++) {
            if(matrix[newCL][i]==target){
                return true;
            }
        }
        return false;
    }
}
