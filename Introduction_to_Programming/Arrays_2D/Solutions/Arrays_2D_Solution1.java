public class Arrays_2D_Solution1 {
    public int[][] solve(int[][] arr) {
        int[][] ans = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr[0].length; i++)
        {
            for (int j = 0; j < arr.length; j++)
                ans[i][j] = arr[j][i];
        }

        return ans;
    }
}
