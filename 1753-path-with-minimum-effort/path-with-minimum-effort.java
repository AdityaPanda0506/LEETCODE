class Solution {
    public int minimumEffortPath(int[][] heights) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));

        q.offer(new int[]{0,0,0});

        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];

        for(int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        dist[0][0] = 0;

        int eff = 0;
        int[][] dir = {{1,0}, {-1,0}, {0,1}, {0,-1}};

        while(!q.isEmpty()){
            int[] a = q.poll();
            eff = a[0];
            int x = a[1];
            int y = a[2];

            if(eff > dist[x][y]) continue;

            if(x == m-1 && y == n-1) return eff;

            for(int[] k:dir){
                int nr = x+k[0];
                int nc = y+k[1];

                if(nr>=0 && nc >= 0 && nr < m && nc < n){
                    int nd = Math.max(eff, Math.abs(heights[x][y] - heights[nr][nc]));
                    if(nd < dist[nr][nc]){
                        dist[nr][nc] = nd;
                        q.offer(new int[]{nd, nr, nc});
                    }
                }
            }
        }

        return -1;
    }
}