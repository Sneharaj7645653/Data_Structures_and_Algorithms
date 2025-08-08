import java.lang.*;
import java.util.*;

public class Functional_Programming3_Solution5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m;
        int[][] matrix = new int[m][n];
        for( int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix[0].length;i++)
        {
            for(int j = 0;j<matrix.length;j++)
            {
                System.out.print(matrix[j][i]+" ");
            }
            i++;
            if(i<matrix[0].length)
            {
                for(int j = matrix.length-1;j>=0;j--)
                {
                    System.out.print(matrix[j][i]+" ");
                }
            }
        }
    }
}