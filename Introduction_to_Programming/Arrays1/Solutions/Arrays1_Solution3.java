import java.lang.*;
import java.util.*;

public class Arrays1_Solution3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(j!=i)
                    System.out.print(j+" ");
                else
                    System.out.print(j);
            }
            System.out.println();
        }

    }
}