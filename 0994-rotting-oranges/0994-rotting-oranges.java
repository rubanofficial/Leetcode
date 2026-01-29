class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    fresh++;
                } else if (grid[i][j] == 2) {
                    q.offer(new int[]{i, j});
                }
            }
        }

        int time = 0;

        while (!q.isEmpty() && fresh > 0) {
            int size = q.size(); 
            time++;

            for (int k = 0; k < size; k++) {
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];

                if (r + 1 < m && grid[r + 1][c] == 1) {
                    grid[r + 1][c] = 2;
                    fresh--;
                    q.offer(new int[]{r + 1, c});
                }
                if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                    grid[r - 1][c] = 2;
                    fresh--;
                    q.offer(new int[]{r - 1, c});
                }
                if (c + 1 < n && grid[r][c + 1] == 1) {
                    grid[r][c + 1] = 2;
                    fresh--;
                    q.offer(new int[]{r, c + 1});
                }
                if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                    grid[r][c - 1] = 2;
                    fresh--;
                    q.offer(new int[]{r, c - 1});
                }
            }
        }

        return fresh == 0 ? time : -1;
    }
}
