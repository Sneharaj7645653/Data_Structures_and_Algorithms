public class Functional_Programming2_Solution1 {
    public int solve(int[] arr)
    {
        int count = 0;
        for(int j = 1;j<=arr.length-1;j++)
        {
            for(int i = j-1;i>=0;i--)
            {
                if(arr[i] < arr[i+1])
                {
                    break;
                }
                else
                {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
