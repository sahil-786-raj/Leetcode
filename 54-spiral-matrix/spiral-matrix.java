class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int startrow = 0;
        int startcol = 0;
        int endrow = n-1;
        int endcol = m-1;

        List<Integer> list = new ArrayList<>();
        while(startrow <= endrow && startcol <= endcol){

            for(int j=startcol; j<=endcol; j++){
                list.add(matrix[startrow][j]);
            }

            for(int i=startrow+1; i<=endrow; i++){
                list.add(matrix[i][endcol]);
            }

            for(int k=endcol-1; k>=startcol; k--){
                if(startrow == endrow){
                    break;
                }
                list.add(matrix[endrow][k]);
            }

            for(int l=endrow-1; l>=startrow+1; l--){
                if(startcol == endcol){
                    break;
                }
                list.add(matrix[l][startcol]);
            }

            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        return list;
    }
}