//Shift 2D Grid
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int len = m*n;
        int[] temp = new int[len];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                temp[(i*n)+j] = grid[i][j];
            }
        }
        k = k % len;
        k = len - k;
        k = (k == len) ? 0 : k;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < m; i++){
            List<Integer> an = new ArrayList<>();
            for(int j = 0; j < n; j++){
                an.add(temp[k]);
                k = (k+1 == len) ? 0 : k+1;
            }
            ans.add(an);
        }
        return ans;
    }
}
