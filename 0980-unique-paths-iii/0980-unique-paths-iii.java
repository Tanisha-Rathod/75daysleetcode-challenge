class Solution {
    int n, m ;
    int result;
    int nonobs;

private void backtrack(int[][] grid,int i, int j,  int count){
    if(i>=n || j>=m||i<0||j<0 ||grid[i][j]==-1){
        return ;
    }
    if(grid[i][j]==2){
        if(count==nonobs)
        result++;
        return;
    }

    int temp= grid[i][j];
    grid[i][j] = -1;
    backtrack(grid, i-1 , j , count+1);
    backtrack(grid, i+1 , j , count+1);
    backtrack(grid, i , j+1 , count+1);
    backtrack(grid, i , j-1 , count+1);

    



    grid[i][j] = temp;
    return ;

}


    public int uniquePathsIII(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        int starti =0;
        int startj=0;
        for(int i=0; i<n; i++){
            for(int j=0;j<m; j++){
                if(grid[i][j]==0){
                    nonobs++;
                }
                if(grid[i][j]==1){
                    starti=i;
                    startj = j;

                }
            }
        }
        nonobs+=1;
        int count =0;
        backtrack(grid, starti, startj, count);
        return result;
    }
}