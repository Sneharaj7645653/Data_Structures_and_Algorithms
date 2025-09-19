 class Subarrays_Solution1 {
    public int solve(int[] A) {
        int count=0;
        for(int i=0; i<A.length; i++)
        {
            int sum=0;
            for(int j=i; j<A.length; j++)
            {
                sum+=A[j];
                if(isPrime(sum))
                {
                    count++;
                }
            }

        }
        return count;
    }
    public static boolean isPrime(int n)
    {
        int noOfFactors=0;
        int count=1;
        while(count*count<=n)
        {
            if(n%count==0 && n/count!=count)
            {
                noOfFactors+=2;
            }
            else if(n%count==0 && n/count==count)
            {
                noOfFactors+=1;
            }
            count++;
        }
        return noOfFactors==2;
    }
}
