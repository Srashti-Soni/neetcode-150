class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int n=prerequisites.length;
        if(n==0) return true;
        List<List<Integer>> adj= new ArrayList<>();
        for(int i=0;i<numCourses;i++){
           adj.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj.get(v).add(u);
        }
        int[] in= new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int a:adj.get(i)){
                in[a]++;
            }
        }

        int count=0;
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(in[i]==0) {
                count++;
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int i:adj.get(curr)){
                in[i]--;
                if(in[i]==0){
                    q.add(i);
                    count++;
                }
            }
        }
        if(count==numCourses) return true;
        return false;
    }
}
