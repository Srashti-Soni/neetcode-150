class Solution {
    public int lengthOfLongestSubstring(String s) {
        int st = 0;
        int size = 0;
        int max = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            }
             else {
                int last = map.get(ch);
                st = Math.max(st, last + 1);
                map.put(ch, i);
            }
            size = i - st + 1;
            max = Math.max(max, size);
        }

        return max;
    }
}