public class ArrayList1_Solution2 {
    public int[] solve(int[] A) {
        int count =0;
        for(int i=0; i<A.length; i++)
        {
            if(A[i]%2 != 0)
            {
                count++;
            }
        }
        int[] array = new int[count];
        for(int i=0,j=0; i<A.length; i++)
        {
            if(A[i]%2 != 0)
            {
                array[j++] = A[i];
            }
        }
        return array;
    }
}
