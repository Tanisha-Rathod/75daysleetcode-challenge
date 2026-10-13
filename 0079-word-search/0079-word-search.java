class Solution {
    int m, n;
String word;

private boolean find(  char[][] board,   int i, int j, int idx){

    if(idx==word.length()){
        return true;
    } 

    if(i<0 ||j<0||i>=m||j>=n || board[i][j]!=word.charAt(idx) || board[i][j]=='*'){
        return false;
    }
    // if(idx==word.length()){
    //     return true;
    // }
 
  char temp = board[i][j];
  board[i][j] ='*';

     boolean exist =  find(board, i+1,j,idx+1)||
     find(board, i-1,j,idx+1)||
     find(board, i,j+1,idx+1)||
     find(board, i,j-1,idx+1);

     board[i][j]=temp;

     return exist ;
     
     

}

    public boolean exist(char[][] board, String word) {
         m = board.length;
         n = board[0].length;
        this.word = word;
        char ch[] = word.toCharArray();

        for(int i=0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(board[i][j]== ch[0]&&find(  board , i, j , 0 )){
                    return true;
                }
            }
        }
        return false;
    }
}