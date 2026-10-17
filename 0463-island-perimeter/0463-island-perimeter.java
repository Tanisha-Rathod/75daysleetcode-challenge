class Solution {
    int m, n ;
    int parameter;

private void bfs(int[][]grid, int i, int j){
    if(i<0|| i>=m || j<0||j>=n||grid[i][j]==0){
        parameter++;
        return ;
    }
    if(grid[i][j]==-1){
        return;
    }
    

    grid[i][j]=-1;//mark visit
    bfs(grid, i+1, j );
    bfs(grid, i-1, j );
    bfs(grid, i, j-1 );
    bfs(grid, i, j+1 );


}


    public int islandPerimeter(int[][] grid) {
         m= grid.length;
         n = grid[0].length;
         parameter = 0;
        for(int i=0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j]==1){
                    bfs(grid, i, j );
                    return parameter;
                }
            }
        }
return -1;
        
        
    }
}