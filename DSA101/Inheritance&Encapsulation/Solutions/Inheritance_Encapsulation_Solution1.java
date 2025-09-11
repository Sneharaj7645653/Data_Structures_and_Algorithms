public class Inheritance_Encapsulation_Solution1 {
    public int[] solve(int[] A, int[] B) {
        int[] ans = new int[A.length];
        ans[0]=0;
        for(int i=1; i<A.length; i++)
        {
            int count=0;
            for(int j=i-1; j>=0; j--)
            {
                Rectangle rect = new Rectangle(A[j],B[j]);
                if(rect.isSquare() && rect.isAreaGreater(A[i]*B[i]))
                {
                    count++;
                }
            }
            ans[i]=count;
        }
        return ans;
    }

    public class Rectangle
    {
        int l;
        int b;

        Rectangle(int l, int b)
        {
            this.l=l;
            this.b=b;

        }
        boolean isSquare()
        {
            return this.l==this.b;
        }
        int area()
        {
            return this.l*this.b;
        }
        boolean isAreaGreater(int k)
        {
            return this.l*this.b>k;
        }
    }
}

