public class Functional_Programming_Solution1 {
    public int solve(int A) {
        int temp = 1;
        for(int i = 2;i<=A;i++)
        {
            temp = temp*i;
        }
        return temp;
    }
}
