class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board [][] =new char[n][n];
List<List<String>>ans = new ArrayList<>();

        //fill the board 
        for(int i=0; i<n; i++){
            Arrays.fill(board[i], '.');
        }
        Nqueens(n, 0, board,ans);
return ans;
}

private void Nqueens(int n, int row,  char board[][] ,List<List<String>>ans){
if(row==n){
    List<String>list = new ArrayList<>();
    for(int i=0; i<n; i++){
    list.add(new String(board[i]));}
    ans.add(list);
    return;
    
}


    for(int j=0; j<n; j++){
        if(isSafe(n, row,j,board)){
            board[row][j]='Q';
            Nqueens(n, row+1, board,ans);
            board[row][j] = '.';
        }
        
    }
}
    
        private boolean isSafe(int n, int row, int col,char board[][] ){
//h(orizontal
for(int j=0; j<n; j++){
    if(board[row][j]=='Q'){
return false;
    }}

    //vertical
    for(int i=0;i<n; i++){
        if(board[i][col]=='Q'){
            return false;
        }}
        //left digonal
for(int i=row, j=col; i>=0&& j>=0;  i--,j--){
    if(board[i][j]=='Q'){
        return false;
    }}
for(int i=row, j=col; i>=0&& j<n;  i--,j++){
    if(board[i][j]=='Q'){
        return false;
    }

}
return true;   
}
            
    }
