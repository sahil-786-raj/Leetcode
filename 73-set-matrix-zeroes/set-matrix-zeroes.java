class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for(int i=0; i<rows.length; i++){
            if(rows[i]==true){
                for(int k=0; k<matrix[0].length; k++){
                    matrix[i][k] = 0;
                }
            }
        }

        for(int j=0; j<columns.length; j++){
            if(columns[j]==true){
                for(int k=0; k<matrix.length; k++){
                    matrix[k][j] = 0;
                }
            }
        }
    }
}