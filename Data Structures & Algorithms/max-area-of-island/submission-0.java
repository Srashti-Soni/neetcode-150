class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] vis= new int[n][m];
        for(int[] rows:vis){
              Arrays.fill(rows,0);
        }
       int count=0;
        for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
            if(vis[i][j]==0&&grid[i][j]==1){
                 count=Math.max(dfs(grid,i,j,vis),count);
            }
           }
        }
        return count;
    }
    public int dfs(int[][] g,int i,int j,int[][] vis){
        if(i<0 ||j<0) return 0;
        if(i>g.length-1 ||j>g[0].length-1) return 0;
           if(vis[i][j]==1||g[i][j]==0) return 0;
            vis[i][j]=1;
         int left= dfs(g,i,j-1,vis);
           int right= dfs(g,i,j+1,vis);
             int down= dfs(g,i+1,j,vis);
             int up= dfs(g,i-1,j,vis);
             return 1+left+right+down+up;
             

    }
}

