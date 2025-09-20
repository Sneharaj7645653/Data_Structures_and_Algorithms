public class Optimising_Range_Queries_Solution2 {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] ans = new long[B.length];
        long[] pr=new long[A.length];
        pr[0]=A[0];
        for(int i=1; i<A.length; i++){
            pr[i]= 0l + pr[i-1]+A[i];
        }
        for(int i=0; i<ans.length;i++){
            if(B[i][0]==0){
                ans[i] = pr[B[i][1]];
            }
            else{
                ans[i] = pr[B[i][1]]-pr[B[i][0]-1];
            }
        }
        return ans;
    }
}
