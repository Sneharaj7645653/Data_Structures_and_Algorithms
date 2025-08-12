import java.util.ArrayList;

public class ArrayList2_Solution3 {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<A.size(); i++)
        {
            for(int j=0; j<A.get(i).size(); j++)
            {
                if(j==i)
                {
                    ans.add(A.get(i).get(j));
                }
            }
        }
        return ans;
    }
}
