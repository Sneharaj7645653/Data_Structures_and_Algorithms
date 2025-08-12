import java.util.ArrayList;

public class ArrayList2_Solution2 {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<A.size(); i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            ans.add(temp);
            for(int j=0; j<A.get(i).size(); j++)
            {
                if((int)(A.get(i).get(j)) % 2==0)
                {
                    ans.get(i).add(A.get(i).get(j));
                }
            }
        }
        return ans;
    }
}
