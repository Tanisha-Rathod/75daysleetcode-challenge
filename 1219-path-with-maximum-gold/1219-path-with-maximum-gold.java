class Solution {
    int n, m;
    int maxgold;

private int bfs (int[][] grid, int i, int j){
    if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0){
        return 0;
    }
    int temp = grid[i][j];
    grid[i][j] = 0;
    
    // int down  =  bfs(grid, i+1,j);
    // int up =  bfs(grid, i-1,j);
    //  int right = bfs(grid, i,j+1);
    // int left =  bfs(grid, i,j-1);

 int down  = bfs(grid, i + 1, j);
        int up    = bfs(grid, i - 1, j);
        int right = bfs(grid, i, j + 1);
        int left  = bfs(grid, i, j - 1);



grid[i][j] = temp;
return temp+Math.max(Math.max(up,down),
 Math.max(left,right));
}


    public int getMaximumGold(int[][] grid) {
n = grid.length;
m = grid[0].length;
 maxgold = 0;
for(int i=0; i<n; i++){
    for(int j=0; j<m; j++){
        if(grid[i][j]>0){
            // bfs( grid, i,j);
            maxgold = Math.max(maxgold, bfs(grid, i, j));
        }
    }
}
return maxgold;
        
    }
}