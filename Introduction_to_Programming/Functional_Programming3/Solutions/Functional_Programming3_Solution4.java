public class Functional_Programming3_Solution4 {
    public int solve(int[][] A, int B) {
        int max = A[0][B];
        for(int i=0; i<A.length; i++)
        {
            if( A[i][B]>max )
            {
                max = A[i][B];
            }
        }
        return max;
    }
}
