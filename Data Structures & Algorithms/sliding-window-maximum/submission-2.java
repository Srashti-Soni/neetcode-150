class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int maxidx=0;
        int arr[]= new int[nums.length-k+1];
        Deque<Integer> q= new LinkedList<>();
        for(int i=0;i<nums.length;i++){
            while(!q.isEmpty()&&nums[q.peekLast()]<nums[i]){
                 q.pollLast();
            }
            q.offerLast(i);
             while(!q.isEmpty() && q.peekFirst()<=i-k){
                q.pollFirst();
             }
             if(i>=k-1){
                arr[maxidx++]=nums[q.peekFirst()];
             }
        }
        return arr;  
       }
     }

