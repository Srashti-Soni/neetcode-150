class Solution {
    List<List<Integer>> outer= new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) { 
        int n=nums.length;
        helper(nums,target,0,new ArrayList<>());
        return outer;
    }
    public void helper(int nums[],int t,int i,List<Integer> inner){
        if(t<0) return;
       if(t==0) {
        outer.add(new ArrayList<>(inner));
        return;
       }
       if(i>=nums.length){
        if(t==0) {
            outer.add(new ArrayList<>(inner));
        }
        return;
       }
       inner.add(nums[i]);
       helper(nums,t-nums[i],i,inner);
       inner.remove(inner.size()-1);
       helper(nums,t,i+1,inner);
    }
}
