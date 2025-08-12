import java.util.ArrayList;

public class ArrayList2_Solution1 {
    public ArrayList<ArrayList<Integer>> generateMatrix(int N) {
        int value=1;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<N;i++)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            ans.add(temp);
            for(int j=0; j<N; j++)
            {
                ans.get(i).add(0);
            }
        }
        int rowStart=0;
        int rowEnd=N-1;
        int colStart=0;
        int colEnd=N-1;
        while(rowStart<=rowEnd && colStart<=colEnd)
        {
            for(int i=colStart; i<=colEnd; i++)
            {
                ans.get(rowStart).set(i,value++);
            }
            rowStart++;
            for(int i=rowStart; i<=rowEnd; i++)
            {
                ans.get(i).set(colEnd,value++);
            }
            colEnd--;
            if(rowStart<=rowEnd)
            {
                for(int i=colEnd; i>=colStart; i--)
                {
                    ans.get(rowEnd).set(i,value++);
                }
                rowEnd--;
            }
            if(colStart<=colEnd)
            {
                for(int i=rowEnd; i>=rowStart; i--)
                {
                    ans.get(i).set(colStart,value++);
                }
                colStart++;
            }

        }
        return ans;
    }
}
