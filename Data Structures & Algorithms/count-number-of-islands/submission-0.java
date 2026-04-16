class Solution {
  
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m= grid[0].length;
        int count=0;
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                     dp(i,j,grid);
                     count++;
                }
               
            }
        }
        return count;
    }
    public void dp(int i,int j,char[][] g){
        if(i<0 ||j<0) return;
        if(i>=g.length||j>=g[i].length) return;
        if(g[i][j]=='0'){
          return;
        }
        g[i][j]='0';
        dp(i+1,j,g);
        dp(i-1,j,g);
        dp(i,j+1,g);
        dp(i,j-1,g);

    }
}
