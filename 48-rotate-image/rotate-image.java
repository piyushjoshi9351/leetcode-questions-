class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<i;j++){
                int temp = matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i] = temp;
            }
            
        }
        for(int i=0;i<matrix.length;i++){
            int stcol=0,endcol=matrix[0].length-1;
            while(stcol<endcol){
                int temp = matrix[i][stcol];
                matrix[i][stcol]=matrix[i][endcol];
                matrix[i][endcol]=temp;
                stcol++;
                endcol--;
            }
        }
    }
}