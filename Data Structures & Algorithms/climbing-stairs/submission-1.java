class Solution {
    int dp[][];
    public int climbStairs(int n) {
        // dp= new int[n+1][n+1];
         int f=1;
        int s=2;
        if(n<=1) return 1;
        
        for(int i=s+1;i<=n;i++){
          int curr=f+s;
          f=s;
          s=curr;
        }
        return s;
    }
}
//         dp= new int[n+1][n+1];
//        return helper(0,n);
//     }
//     public int helper(int i,int n){
//     if(i==n){
//         return 1;
//     }
// if( i>n) return 0;

   
//      int ways=helper(i+1,n)+helper(i+2,n);
//      return ways;
// }
// }
