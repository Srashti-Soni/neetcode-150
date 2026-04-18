class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> outer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int sum = nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (-sum == nums[left] + nums[right]) {
                    List<Integer> inner = new ArrayList<>();
                    inner.add(nums[i]);
                    inner.add(nums[left]);
                    inner.add(nums[right]);
                    outer.add(inner);

                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;

                    left++;
                    right--;
                } else if (-sum > nums[left] + nums[right]) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return outer;
    }
}