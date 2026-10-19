class Solution {
    int m,n;
    int iland;
    private void bfs(char[][]grid, int i, int j){
        if(i<0 ||j<0||i>=m||j>=n ||grid[i][j]!='1'){
            return ;
        }

        
        grid[i][j]='$';//mark visit
    bfs(grid, i+1, j );
    bfs(grid, i-1, j );
    bfs(grid, i, j-1 );
    bfs(grid, i, j+1 );

    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        n =  grid[0].length;
        iland = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
bfs(grid,i,j);
iland+=1;
                }
            }
        }
        return iland;
    }
}