public class Optimising_Range_Queries_Solution3 {
    public long subarraySum(int[] A) {
        long ans=0l;
        for(int i=0; i<A.length;i++){
            ans += (long)A[i] * (i + 1) * (A.length- i);
        }
        return ans;
    }
}
