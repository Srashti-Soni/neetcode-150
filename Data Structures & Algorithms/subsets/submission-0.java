class Solution {
    List<List<Integer>> outer= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> inner = new ArrayList<>();
        backtrack(nums,0,new ArrayList<>());
        return outer;
    }
    public void backtrack(int[] nums,int i,List<Integer> temp){
        if(i==nums.length) {
            outer.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        backtrack(nums,i+1,temp);
        temp.remove(temp.size()-1);
        backtrack(nums,i+1,temp);

    }
}
