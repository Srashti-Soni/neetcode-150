class pair{
    int a,b;
    pair(int a,int b){
       this.a=a;
       this.b=b;
    }
}
class Solution {

    public void islandsAndTreasure(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dir={{0,-1},{0,1},{1,0},{-1,0}};
        Queue<pair> q= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    q.add(new pair(i,j));
                }
            }
        }
        while(!q.isEmpty()){
            pair curr=q.poll();
            int f=curr.a;
            int s=curr.b;
            for(int[] d:dir){
                int ni=f+d[0];
                int nj=s+d[1];
                if(ni>=0 &&nj>=0&&ni<n&&nj<m){
                if(grid[ni][nj]==-1||grid[ni][nj]==0) continue;
                 else{
                     if(grid[f][s]+1<grid[ni][nj])
                       q.add(new pair(ni,nj));
                      grid[ni][nj]=Math.min(grid[f][s]+1,grid[ni][nj]);
                     
                 }
            }
        }
    }

}
}
