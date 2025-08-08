public class Functional_Programming3_Solution8
{
    public int[] solve(int[] arr)
    {
        int[] ans = new int[arr.length-1];

        for(int i = 0;i<arr.length-1;i++)
        {
            int len = arr.length;
            int min = i;
            for(int j = i;j<=len-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            ans[i] = min;
        }
        return ans;
    }
}
