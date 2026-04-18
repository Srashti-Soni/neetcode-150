class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] {i, j, 0});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        int min = 0;
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int f = curr[0];
            int s = curr[1];
            min = curr[2];
            for (int[] d : dir) {
                int ni = f + d[0];
                int nj = s + d[1];
                if (ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length) {
                    if (grid[ni][nj] == 1) {
                        grid[ni][nj] = 2;
                        q.add(new int[] {ni, nj, min + 1});
                        fresh--;
                    } else {
                        continue;
                    }
                }
            }
        }

        return fresh == 0 ? min : -1;
    }
}
