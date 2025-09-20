public class Optimising_Range_Queries_Solution1 {
    public int solve(int[] A) {
        int[] pr=new int[A.length];
        pr[0]=A[0];
        for(int i=1; i<A.length; i++){
            pr[i]=pr[i-1]+A[i];
            //System.out.print(pr[i]);
        }
        int ans=-1;
        for(int i=0;i<pr.length;i++){
            if(i==0){
                if(pr[pr.length-1]-pr[i] == 0){
                    ans=0;
                    break;
                }
            }
            else if(i==pr.length-1){
                if(pr[i-1]==0){
                    ans=i;
                    break;
                }
            }
            else{
                if(pr[i-1]==pr[pr.length-1]-pr[i]){
                    ans=i;
                    break;
                }
            }
        }
        return ans;
    }
}
