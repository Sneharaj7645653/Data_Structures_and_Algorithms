public class Functional_Programming2_Solution2 {
    public int solve(int[] A) {
        int ans = 1;
        for(int i = 0;i<=A.length-2;i++)
        {
            if(A[i]>A[i+1])
            {
                ans = 0;
                break;
            }
        }
        return ans;
    }
}
