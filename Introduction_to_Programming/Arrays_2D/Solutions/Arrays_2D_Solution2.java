public class Arrays_2D_Solution2
{
    public void solve(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0;j<i; j++)
            {
                int temp=arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i< arr.length;i++)
        {
            int s = 0;
            int e = arr.length-1;
            while(s<e)
            {
                int temp = arr[i][s];
                arr[i][s] = arr[i][e];
                arr[i][e] = temp;
                s++;
                e--;
            }

        }
    }
}
