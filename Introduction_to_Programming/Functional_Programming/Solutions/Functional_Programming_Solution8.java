public class Functional_Programming_Solution8 {
    public int solve(int A) {
        if(A>=0)
        {
            return A/200;
        }
        else
        {
            if(A%200 != 0)
                return (A/200)+(-1);
            else
                return (A/200);
        }
    }
}
