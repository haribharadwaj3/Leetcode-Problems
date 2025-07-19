class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] mat=new int[n-2][n-2];
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                mat[i][j]=largest(grid,i,j);
            }
        }
        return mat;
    }
    public int largest(int[][] grid,int r,int c){
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}