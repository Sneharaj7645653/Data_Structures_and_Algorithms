import java.util.ArrayList;

public class ArrayList1_Solution4 {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {


        ArrayList<Integer> compare = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<A.size(); i++)
        {
            if(compare.contains(A.get(i)))
            {
                if(ans.contains(A.get(i)))
                {
                    int index = ans.indexOf(A.get(i));
                    ans.remove(index);
                }

            }
            else
            {
                ans.add(A.get(i));
                compare.add(A.get(i));

            }
        }
        for(int i=1; i<ans.size();i++)
        {
            int j = i-1;
            int temp = ans.get(i);
            while(j>=0 && ans.get(j) > temp)
            {
                ans.set((j+1),ans.get(j));
                j=j-1;
            }
            ans.set(j+1,temp);
        }
        return ans;
    }
}
