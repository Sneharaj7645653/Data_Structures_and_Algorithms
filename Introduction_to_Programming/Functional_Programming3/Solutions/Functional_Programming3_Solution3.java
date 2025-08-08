public class Functional_Programming3_Solution3 {
    public int solve(int[][] A, int B) {
        int max = A[B][0];
        for(int i=0; i<A[B].length; i++)
        {
            if( A[B][i]>max )
            {
                max = A[B][i];
            }
        }
        return max;
    }
}
