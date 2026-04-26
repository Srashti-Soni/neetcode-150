class Solution {
    public void solve(char[][] board) {
        int n= board.length;
        int m=board[0].length;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if((i==0 ||j ==0 ||i==n-1||j==m-1) && board[i][j]=='o')
        //         {
        //           board[i][j]='#';
        //         }
        //     }
        // // }
        // boolean vi[][]= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
               if((i==0 ||j ==0 ||i==n-1||j==m-1) && board[i][j]=='O'){
                      dfs(i,j,board);
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
                if(board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        } for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){ 
                if(board[i][j]=='#'){
                    board[i][j]='O';
                }
            }
        }
        
    }
        public void dfs(int i,int j,char[][] b){
            // vi[i][j]= true;
            if(i<0 ||j<0) return ;
            if(i>=b.length ||j>=b[i].length) return ;
            if(b[i][j]=='X'|| b[i][j]=='#') return;
             b[i][j]='#';
               dfs(i-1,j,b);
               dfs(i+1,j,b);
               dfs(i,j+1,b);
               dfs(i,j-1,b);


        }
    }
