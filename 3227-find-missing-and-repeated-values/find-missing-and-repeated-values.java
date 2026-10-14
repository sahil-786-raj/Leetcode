class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int arr[] = new int[n*n];
        int index = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[index]=grid[i][j];
                index++;
            }
        }

        Arrays.sort(arr);

        int a=-1;
    
        for(int i=1; i<arr.length; i++){
            if(arr[i]==arr[i-1]){
                a=arr[i];
                break;
            }
        }

        int as=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                as+=grid[i][j];
            }
        }

        int num = n*n;
        int es = (num*(num+1))/2;

        int b = es + a - as;

        int z[]=new int[2];
        z[0]=a;
        z[1]=b;
        return z;
    }
}