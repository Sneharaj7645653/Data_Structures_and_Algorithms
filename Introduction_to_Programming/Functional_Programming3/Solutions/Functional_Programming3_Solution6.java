import java.lang.*;
import java.util.*;

public class Functional_Programming3_Solution6 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for( int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }


        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            i++;
            if(i<n)
                for(int j=n-1;j>=0;j--)
                {
                    System.out.print(matrix[i][j]+" ");
                }
        }
    }
}