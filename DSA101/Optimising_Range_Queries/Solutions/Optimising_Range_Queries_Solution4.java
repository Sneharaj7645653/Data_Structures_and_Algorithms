import java.util.ArrayList;

class Optimising_Range_Queries_Solution4 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0;i<A.size();i++){
            if(i!=A.size()-1){
                int count=0;
                for(int j=i+1; j<A.size();j++){
                    if(A.get(i)<A.get(j)){
                        count=-1;
                        break;
                    }

                }
                if(count==0){
                    ans.add(A.get(i));
                }
            }
            else{
                ans.add(A.get(i));
            }
        }
        return ans;
    }
}
