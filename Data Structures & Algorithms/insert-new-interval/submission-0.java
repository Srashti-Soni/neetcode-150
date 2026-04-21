class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int start = newInterval[0];
        int end = newInterval[1];
        boolean added = false;

        for (int i = 0; i < intervals.length; i++) {
            int s = intervals[i][0];
            int e = intervals[i][1];

            if (e < start) {
                res.add(new int[] {s, e});
            } else if (s > end) {
                if (!added) {
                    res.add(new int[] {start, end});
                    added = true;
                }
                res.add(new int[] {s, e});
            } else {
                start = Math.min(start, s);
                end = Math.max(end, e);
            }
        }

        if (!added) {
            res.add(new int[] {start, end});
        }

        return res.toArray(new int[res.size()][]);
    }
}